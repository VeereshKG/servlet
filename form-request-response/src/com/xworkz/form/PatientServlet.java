package com.xworkz.form;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/patient", loadOnStartup = 1)

public class PatientServlet extends GenericServlet {

    public PatientServlet() {
        System.out.println("Created PatientServlet");
    }

    @Override
    public void service(ServletRequest request, ServletResponse servletResponse) throws ServletException, IOException {

        System.out.println("");
        System.out.println("Patient Details");

        String id = request.getParameter("id");
        String doctorName = request.getParameter("doctorName");
        String disease = request.getParameter("disease");
        String name = request.getParameter("name");
        String gender = request.getParameter("gender");
        String bloodGroup = request.getParameter("bloodGroup");
        String mobileNo = request.getParameter("mobileNo");
        String dob = request.getParameter("dateOfBirth");
        String age = request.getParameter("age");
        String maritalStatus = request.getParameter("maritalStatus");
        String address = request.getParameter("address");

        System.out.println("Id : " + id);
        System.out.println("Doctor Name : " + doctorName);
        System.out.println("Disease : " + disease);
        System.out.println("Patient Name : " + name);
        System.out.println("Gender : " + gender);
        System.out.println("Blood Group : " + bloodGroup);
        System.out.println("Mobile No : " + mobileNo);
        System.out.println("Date Of Birth : " + dob);
        System.out.println("Age : " + age);
        System.out.println("Marital Status : " + maritalStatus);
        System.out.println("Address : " + address);


        servletResponse.setContentType("text/html");
        PrintWriter writer = servletResponse.getWriter();

        writer.println("Patient Registered Successfully<br><br>");
        writer.println("Entered Details Are :<br><br>");

        writer.println("Id : " + id + "<br>");
        writer.println("Doctor Name : " + doctorName + "<br>");
        writer.println("Disease : " + disease + "<br>");
        writer.println("Patient Name : " + name + "<br>");
        writer.println("Gender : " + gender + "<br>");
        writer.println("Blood Group : " + bloodGroup + "<br>");
        writer.println("Mobile No : " + mobileNo + "<br>");
        writer.println("Date Of Birth : " + dob + "<br>");
        writer.println("Age : " + age + "<br>");
        writer.println("Marital Status : " + maritalStatus + "<br>");
        writer.println("Address : " + address + "<br>");


    }
}
