package servlet;

import lombok.extern.log4j.Log4j2;
import model.Car;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@Log4j2
@WebServlet("/Save")
public class Save extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.sendRedirect("https://www.google.com");
        log.info("redirecting... to https://www.google.com");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        View view = new View();
        List<Car> carList = view.viewCar();
        int size = view.viewCar().size();

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        int powerInt;
        int mileageInt;
        String name = request.getParameter("name");
        String power = request.getParameter("power");
        String mileage = request.getParameter("mileage");

        if(name.isEmpty()){
            name=null;
        }
        if (!power.isEmpty()) {
            powerInt = Integer.parseInt(power);
        } else {
            powerInt = 0;
        }
        if (!mileage.isEmpty()) {
            mileageInt = Integer.parseInt(mileage);
        } else {
            mileageInt = 0;
        }

        Car car = Car.builder()
                .id(++size)
                .model(name)
                .power(powerInt)
                .mileage(mileageInt)
                .build();

        out.println("<h1> Added successfully! </h1>");
        out.println("<form action=/homework <colspan=1><input type=submit value=Homepage></form>");
        carList.add(car);
        view.simpleReader(out, carList);

        log.debug("Added successfully!");
    }
}
