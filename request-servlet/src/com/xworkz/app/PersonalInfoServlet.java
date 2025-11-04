package com.xworkz.app;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/personal", loadOnStartup = 2)
public class PersonalInfoServlet extends GenericServlet {

    public PersonalInfoServlet() {
        System.out.println("Created PersonalInfoServlet");
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {

        System.out.println("Personal Information");
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String mobileno = request.getParameter("mobileNo");
        String age = request.getParameter("age");
        String address = request.getParameter("address");
        String gender = request.getParameter("gender");
        String dob = request.getParameter("dateOfBirth");
        String status = request.getParameter("maritalStatus");

        System.out.println("Name :" + name);
        System.out.println("Email :" + email);
        System.out.println("Mobile No :" + mobileno);
        System.out.println("Age :" + age);
        System.out.println("Address :" + address);
        System.out.println("Gender :" + gender);
        System.out.println("DateOfBirth :" + dob);
        System.out.println("Marital Status :" + status);
    }
}
