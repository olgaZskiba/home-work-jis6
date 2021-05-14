package io.github.olgazskiba.myServlets;

import io.github.olgazskiba.bean.StudentsServlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AllStudentsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("studentList", StudentsServlet.total);
        req.setAttribute("studentsTotal", StudentsServlet.total.size());
        RequestDispatcher view = req.getRequestDispatcher("allStudents.jsp");

        view.forward(req, resp);


    }

}
