package servlet;

import lombok.extern.log4j.Log4j2;
import model.Car;

import javax.servlet.ServletConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@Log4j2
@WebServlet("/View")
public class View extends HttpServlet {

    private String name;

    public void init(ServletConfig servletConfig) {
        name = servletConfig.getInitParameter("name");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        log.debug("Entering in doGet method!");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1> Welcome " + name + "! Car List </h1>");
        out.println("<form action=/homework <colspan=1><input type=submit value=Back></form>");
        List<Car> carList = viewCar();
        out.println("<table border='1', width='100%'>");
        out.println("<tr>" +
                "<th>ID</th>" +
                "<th>Model</th>" +
                "<th>Power [HP]</th>" +
                "<th>Mileage [KM]</th>" +
                "</tr>");

        for (Car car : carList) {
            out.println("<tr>" +
                    "<td>" + car.getId() + "</td>" +
                    "<td>" + car.getModel() + "</td>" +
                    "<td>" + car.getPower() + "</td>" +
                    "<td>" + car.getMileage() + "</td>" +
                    "<td><a href='Select?id=" + car.getId() + "'>EDIT</a></td>" +
                    "<td><a href='Delete?id=" + car.getId() + "'>DELETE</a></td>" +
                    "</tr>");
        }
        out.println("</table>");

        log.debug("Display successfully!");
    }

    //this method will generate a table
    protected void simpleReader(PrintWriter out, List<Car> carList) {
        out.println("<table border='1', width='100%'>");
        out.println("<tr>" +
                "<th>ID</th>" +
                "<th>Model</th>" +
                "<th>Power [HP]</th>" +
                "<th>Mileage [KM]</th>" +
                "</tr>");

        for (Car car : carList) {
            out.println("<tr>" +
                    "<td>" + car.getId() + "</td>" +
                    "<td>" + car.getModel() + "</td>" +
                    "<td>" + car.getPower() + "</td>" +
                    "<td>" + car.getMileage() + "</td>" +
                    "</tr>");
        }
        out.println("</table>");
    }

    //the pre-defined list
    public List<Car> viewCar() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car(1, "Opel", 122, 100000));
        carList.add(new Car(2, "Dacia", 95, 120000));
        carList.add(new Car(3, "Nissan", 250, 70000));
        return carList;
    }

    @Override
    public void destroy() {
        log.info("The servlet has been destroyed!");
    }
}
