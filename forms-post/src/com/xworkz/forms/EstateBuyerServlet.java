package com.xworkz.forms;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/buyer", loadOnStartup = 1)

public class EstateBuyerServlet extends GenericServlet {

    public EstateBuyerServlet() {
        System.out.println("Created EstateBuyerServlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        System.out.println("");
        System.out.println("Estate Buyer Details");

        String buyerName = servletRequest.getParameter("buyerName");
        String email = servletRequest.getParameter("email");
        String phone = servletRequest.getParameter("phone");
        String city = servletRequest.getParameter("city");
        String budget = servletRequest.getParameter("budget");
        String propertyType = servletRequest.getParameter("propertyType");
        String bedrooms = servletRequest.getParameter("bedrooms");
        String furnished = servletRequest.getParameter("yes");
        String preferredArea = servletRequest.getParameter("preferredArea");

        System.out.println("Buyer Name : " + buyerName);
        System.out.println("Email : " + email);
        System.out.println("Phone : " + phone);
        System.out.println("City : " + city);
        System.out.println("Budget : " + budget);
        System.out.println("Property Type : " + propertyType);
        System.out.println("Bedrooms : " + bedrooms);
        System.out.println("Furnished : " + furnished);
        System.out.println("Preferred Area : " + preferredArea);

    }
}
