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
@WebServlet("/Edit")
public class Edit extends HttpServlet {

    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doPut(request, response);
    }

    public void doPut(HttpServletRequest request, HttpServletResponse response) throws IOException {
        log.debug("Entering in doPut method!");
        View view = new View();
        List<Car> carList = view.viewCar();

        PrintWriter out = response.getWriter();

        String idParam = request.getParameter("id");
        String dataParam = request.getParameter("data");
        String textParam = request.getParameter("text");

        int id = Integer.parseInt(idParam);

        switch (dataParam) {
            case "Power":
                carList.get(--id).setPower(Integer.parseInt(textParam));
                break;
            case "Model":
                carList.get(--id).setModel(textParam);
                break;
            case "Mileage":
                carList.get(--id).setMileage(Integer.parseInt(textParam));
                break;
        }

        out.println("<h1> Number " + ++id + " was edited successfully! </h1>");
        out.println("<form action=/homework <colspan=1><input type=submit value=Homepage></form>");
        view.simpleReader(out, carList);
        log.debug("Edited successfully!");
    }
}
