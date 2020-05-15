package servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Select")
public class Select extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        String id = request.getParameter("id");

        out.println("<h1> Number " + id + " is up to edit!</h1>");
        out.println("<form action=/homework/Edit <colspan=1>" +
                "<input type=hidden value=" + id + " name=id>" +
                "Choose the field:" +
                "<select name=data>" +
                "<option value=Model>Model</option>" +
                "<option value=Power>Power</option>" +
                "<option value=Mileage>Mileage</option>" +
                "</select>" +
                "<h3>" + " " + "</h3>" +
                "New data: " +
                "<input type=text name=text>" +
                "<h3>" + " " + "</h3>" +
                "<input type=submit value=Submit>" +
                "</form>");

        out.println("<form action=/homework <colspan=1><input type=submit value=Homepage></form>");

    }
}
