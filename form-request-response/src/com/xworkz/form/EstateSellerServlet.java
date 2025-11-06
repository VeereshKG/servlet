package com.xworkz.form;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/seller", loadOnStartup = 1)

public class EstateSellerServlet extends GenericServlet {

    public EstateSellerServlet() {
        System.out.println("Created EstateSellerServlet");
    }

    @Override
    public void service(ServletRequest request, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("");
        System.out.println("Estate Seller Details");

        String sellerName = request.getParameter("sellerName");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String propertyAddress = request.getParameter("propertyAddress");
        String city = request.getParameter("city");
        String price = request.getParameter("price");
        String propertyType = request.getParameter("propertyType");
        String bedrooms = request.getParameter("bedrooms");
        String furnished = request.getParameter("yes");

        System.out.println("Seller Name : " + sellerName);
        System.out.println("Email : " + email);
        System.out.println("Phone : " + phone);
        System.out.println("Property Address : " + propertyAddress);
        System.out.println("City : " + city);
        System.out.println("Price : " + price);
        System.out.println("Property Type : " + propertyType);
        System.out.println("Bedrooms : " + bedrooms);
        System.out.println("Furnished : " + furnished);

        servletResponse.setContentType("text/html");
        PrintWriter writer = servletResponse.getWriter();

        writer.println("Seller Details Submitted Successfully<br><br>");
        writer.println("Entered Details Are:" + "<br>");

        writer.println("Seller Name : " + sellerName + "<br>");
        writer.println("Email : " + email + "<br>");
        writer.println("Phone : " + phone + "<br>");
        writer.println("Property Address : " + propertyAddress + "<br>");
        writer.println("City : " + city + "<br>");
        writer.println("Price : " + price + "<br>");
        writer.println("Property Type : " + propertyType + "<br>");
        writer.println("Bedrooms : " + bedrooms + "<br>");
        writer.println("Furnished : " + furnished + "<br>");

    }
}
