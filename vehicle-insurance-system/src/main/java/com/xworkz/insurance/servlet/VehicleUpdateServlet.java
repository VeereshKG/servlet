package com.xworkz.insurance.servlet;

import com.xworkz.insurance.dto.SearchDTO;
import com.xworkz.insurance.dto.VehicleInsuranceDTO;
import com.xworkz.insurance.exception.DataInvalidException;
import com.xworkz.insurance.service.VehicleInsuranceService;
import com.xworkz.insurance.service.VehicleInsuranceServiceImpl;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@WebServlet(urlPatterns = {"/edit", "/update"}, loadOnStartup = 1)

public class VehicleUpdateServlet extends HttpServlet {

    VehicleInsuranceService vehicleInsuranceService = new VehicleInsuranceServiceImpl();

    public VehicleUpdateServlet() {
        System.out.println("Created VehicleUpdateServlet");
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        System.out.println("Running doGet in VehicleUpdateServlet");

        String vehicleNo = req.getParameter("vehicleNumber");
        SearchDTO searchDTO = new SearchDTO(vehicleNo);

        try {
            Optional<VehicleInsuranceDTO> vehicleInsuranceDTO = vehicleInsuranceService.search(searchDTO);

            System.out.println("Forwarding to VehicleUpdate.jsp");
            req.setAttribute("updateDTO", vehicleInsuranceDTO.get());
            req.getRequestDispatcher("VehicleUpdate.jsp").forward(req, resp);

        } catch (DataInvalidException e) {

        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Running doPost method in VehicleUpdateServlet");

        String ownerName = req.getParameter("ownerName");
        String vehicleNumber = req.getParameter("vehicleNumber");
        String vehicleType = req.getParameter("vehicleType");
        String insuranceType = req.getParameter("insuranceType");
        String amount = req.getParameter("amount");

        System.out.println("Creating instance of dto in VehicleUpdateServlet");
        VehicleInsuranceDTO vehicleInsuranceDTO = new VehicleInsuranceDTO(ownerName, vehicleNumber, vehicleType, insuranceType, Double.parseDouble(amount));

        System.out.println("Invoking validateAndUpdate method");
        this.vehicleInsuranceService.validateAndUpdate(vehicleInsuranceDTO);

        req.setAttribute("ownerName", ownerName);
        req.setAttribute("vehicleNumber", vehicleNumber);
        req.setAttribute("vehicleType", vehicleType);
        req.setAttribute("insuranceType", insuranceType);
        req.setAttribute("amount", amount);
        req.setAttribute("sucess" ,"Updated Successfully");

        req.getRequestDispatcher("Result.jsp").forward(req, resp);
    }
}