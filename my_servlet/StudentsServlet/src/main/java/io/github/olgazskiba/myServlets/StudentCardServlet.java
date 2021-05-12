package io.github.olgazskiba.myServlets;

import io.github.olgazskiba.bean.StudentsServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class StudentCardServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = 0;
        try {
            id = Integer.valueOf(req.getParameter("id"));
        } catch (NumberFormatException e) {
        }

        StudentsServlet s = StudentsServlet.total.get(id);
        PrintWriter out = resp.getWriter();
        out.println(
                "<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +
                        " <meta charset=\"UTF-8\">\n" +
                        " <title>timer</title>\n" +
                        "</head>\n" +
                        "<body align=\"center\">\n" +
                        "<h1> This one will never change! </h1>\n" +
                        "<table align=\"center\">\n" +
                        " <tr>\n" +
                        " <td>\n" +
                        " <img src=\"https://upload.wikimedia.org/wikipedia/commons/a/a0/Reuni%C3%A3o_com_o_ator_norteamericano_Keanu_Reeves_%28cropped%29.jpg\"\n" +
                        " width=\"150px\"\n" +
                        " height=\"150px\"/>\n" +
                        " </td>\n" +
                        " <td>"+s.getName() + " " + s.getLastName() + " <br />" +
                        "</td>\n" +
        " </tr>\n" +
                "</table>\n" +
                "</body>\n" +
                "</html>"
        );
    }
}
