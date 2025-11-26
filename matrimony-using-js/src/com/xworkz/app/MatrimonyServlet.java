package com.xworkz.app;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/matrimony", "/shadi"}, loadOnStartup = 1)

public class MatrimonyServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String email = req.getParameter("email");
        String forWhom = req.getParameter("forWhom");
        String gender = req.getParameter("gender");
        String dob = req.getParameter("dob");
        String motherTongue = req.getParameter("motherTongue");
        String religion = req.getParameter("religion");
        String martialStatus = req.getParameter("martialStatus");
        String height = req.getParameter("height");

        req.setAttribute("email", email);
        req.setAttribute("forwhom", forWhom);
        req.setAttribute("gender", gender);
        req.setAttribute("dob", dob);
        req.setAttribute("motherTongue", motherTongue);
        req.setAttribute("religion", religion);
        req.setAttribute("martialStatus", martialStatus);
        req.setAttribute("height", height);

        req.getRequestDispatcher("MatrimonyResult.jsp").forward(req, resp);


    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("Matrimony.jsp").forward(req, resp);
    }
}
