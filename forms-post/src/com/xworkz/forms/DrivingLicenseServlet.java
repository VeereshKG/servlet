package com.xworkz.forms;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/license", loadOnStartup = 1)

public class DrivingLicenseServlet extends GenericServlet {

    public DrivingLicenseServlet() {
        System.out.println("Created DrivingLicenceServlet");
    }

    @Override
    public void service(ServletRequest request, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Customer Details Applied for Driving licence ");

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String dob = request.getParameter("dob");
        String gender = request.getParameter("gender");
        String address = request.getParameter("address");
        String birthPlace = request.getParameter("place");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String pinCode = request.getParameter("code");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String vehicleType = request.getParameter("vehicleType");
        String licenseType = request.getParameter("licenseType");
        String applyDate = request.getParameter("applyDate");
        String idProof = request.getParameter("idProof");
        String bloodGroup = request.getParameter("bloodGroup");

        System.out.println("First Name : " + firstName);
        System.out.println("Last Name : " + lastName);
        System.out.println("Date of Birth : " + dob);
        System.out.println("Gender : " + gender);
        System.out.println("Address : " + address);
        System.out.println("Birth Place : " + birthPlace);
        System.out.println("City : " + city);
        System.out.println("State : " + state);
        System.out.println("Pin Code : " + pinCode);
        System.out.println("Phone : " + phone);
        System.out.println("Email : " + email);
        System.out.println("Vehicle Type : " + vehicleType);
        System.out.println("License Type : " + licenseType);
        System.out.println("Apply Date : " + applyDate);
        System.out.println("ID Proof : " + idProof);
        System.out.println("Blood Group : " + bloodGroup);

    }
}
