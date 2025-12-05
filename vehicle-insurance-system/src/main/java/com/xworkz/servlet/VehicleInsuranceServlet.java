package com.xworkz.servlet;

import com.xworkz.dto.VehicleInsuranceDTO;
import com.xworkz.exception.DataInvalidException;
import com.xworkz.exception.DataNotSavedException;
import com.xworkz.service.VehicleInsuranceService;
import com.xworkz.service.VehicleInsuranceServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/insurance", loadOnStartup = 1)
public class VehicleInsuranceServlet extends HttpServlet {


    public VehicleInsuranceServlet() {
        System.out.println("VehicleInsuranceServlet is created");
    }

    VehicleInsuranceService vehicleInsuranceService = new VehicleInsuranceServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("Getting parameter");

        String ownerName = req.getParameter("ownerName");
        String vehicleNumber = req.getParameter("vehicleNumber");
        String vehicleType = req.getParameter("vehicleType");
        String insuranceType = req.getParameter("insuranceType");
        String amount = req.getParameter("amount");

        System.out.println("Instance of VehicleInsuranceDTO");
        try {


            VehicleInsuranceDTO vehicleInsuranceDTO = new VehicleInsuranceDTO(ownerName, vehicleNumber, vehicleType, insuranceType, Double.parseDouble(amount));

            System.out.println("VehicleInsurance ---> " + vehicleInsuranceDTO);

            vehicleInsuranceService.validate(vehicleInsuranceDTO);

            System.out.println("Setting Attribute...");

            req.setAttribute("ownerName", ownerName);
            req.setAttribute("vehicleNumber", vehicleNumber);
            req.setAttribute("vehicleType", vehicleType);
            req.setAttribute("insuranceType", insuranceType);
            req.setAttribute("amount", amount);
            req.setAttribute("success", "Data Saved Successfully");

            System.out.println("Forwarding to Result.jsp");
            req.getRequestDispatcher("Result.jsp").forward(req, resp);

        } catch (DataInvalidException e) {
            req.setAttribute("error", "Data not saved");

            req.getRequestDispatcher("Result.jsp").forward(req, resp);

        } catch (DataNotSavedException e) {

            req.setAttribute("vehicleerror", "vehicle number is already exist");
            req.getRequestDispatcher("Result.jsp").forward(req, resp);
        }


    }

}
