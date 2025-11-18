package com.xworkz.coffee.servlet;

import com.xworkz.coffee.dto.CustomerDTO;
import com.xworkz.coffee.dto.CustomerFeedBackDTO;
import com.xworkz.coffee.service.CustomerFeedBackService;
import com.xworkz.coffee.service.impl.CustomerFeedBackServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/feedbackservlet", loadOnStartup = 1)
public class CustomerFeedBackServlet extends HttpServlet {

    public CustomerFeedBackServlet() {
        System.out.println("CustomerFeedBackServlet created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String comments = req.getParameter("comments");
        String rating = req.getParameter("rating");

        System.out.println("Setting attributes in CustomerFeedBackServlet to send to jsp");
        req.setAttribute("name", name);
        req.setAttribute("email", email);
        req.setAttribute("comments", comments);
        req.setAttribute("rating", rating);

        CustomerFeedBackDTO customerFeedBackDTO = new CustomerFeedBackDTO(name, email, comments, Integer.parseInt(rating));
        System.out.println("customerFeedBackDTO ---> "+customerFeedBackDTO);

        CustomerFeedBackService customerFeedBackService = new CustomerFeedBackServiceImpl();
        customerFeedBackService.validateAndSave(customerFeedBackDTO);

        System.out.println("Forwarding to jsp");
        req.getRequestDispatcher("CustomerFeedBackResult.jsp").forward(req, resp);
    }
}
