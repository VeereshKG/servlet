package com.xworkz.coffee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/customerservlet", loadOnStartup = 1)
public class CustomerServlet extends HttpServlet {

    public CustomerServlet() {
        System.out.println("CustomerServlet created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String name = req.getParameter("name");
        String mobile = req.getParameter("mobile");
        String flavour = req.getParameter("flavour");
        int quantity = Integer.parseInt(req.getParameter("quantity"));
        String payment = req.getParameter("payment");

        System.out.println("Setting attributes in CustomerServlet to send to jsp");
        req.setAttribute("name", name);
        req.setAttribute("mobile", mobile);
        req.setAttribute("flavour", flavour);
        req.setAttribute("quantity", quantity);
        req.setAttribute("payment", payment);

        System.out.println("Forwarding to jsp");
        req.getRequestDispatcher("CustomerResult.jsp").forward(req, resp);
    }
}
