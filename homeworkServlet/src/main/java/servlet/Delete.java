package servlet;

import com.google.gson.Gson;
import lombok.extern.log4j.Log4j2;
import model.Car;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@Log4j2
@WebServlet("/Delete")
public class Delete extends HttpServlet {

    private Gson gson = new Gson();

    @Override
    public void service(ServletRequest request, ServletResponse response) throws IOException {
        doDelete(request, response);
    }

    protected void doDelete(ServletRequest request, ServletResponse response) throws IOException {
        log.debug("Entering in doDelete method!");
        View view = new View();
        List<Car> carList = view.viewCar();
        PrintWriter out = response.getWriter();
        String id = request.getParameter("id");
        int idInt = Integer.parseInt(id);
        carList.remove(--idInt);

        //return json
        String userJsonString = this.gson.toJson(carList);
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        out.print(userJsonString);
        out.flush();

//        return text/html
//        response.setContentType("text/html");
//        out.println("<h1> Number " + ++idInt + " was deleted successfully! </h1>");
//        out.println("<form action=/homework <colspan=1><input type=submit value=Homepage></form>");
//        view.simpleReader(out,carList);

        log.info("Deleted successfully!");
    }
}
