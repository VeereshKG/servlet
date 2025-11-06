package com.xworkz.forms;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

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


    }
}
