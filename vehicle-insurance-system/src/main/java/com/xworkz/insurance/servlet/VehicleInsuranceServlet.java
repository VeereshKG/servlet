package com.xworkz.insurance.servlet;

import com.xworkz.insurance.dto.SearchDTO;
import com.xworkz.insurance.dto.VehicleInsuranceDTO;
import com.xworkz.insurance.exception.DataInvalidException;
import com.xworkz.insurance.exception.DataNotSavedException;
import com.xworkz.insurance.service.VehicleInsuranceService;
import com.xworkz.insurance.service.VehicleInsuranceServiceImpl;
import lombok.SneakyThrows;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Optional;

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


        } catch (DataInvalidException e) {
            req.setAttribute("error", "Data not saved");

            req.getRequestDispatcher("VehicleInsurance.jsp").forward(req, resp);

        } catch (DataNotSavedException e) {

            req.setAttribute("vehicleerror", "Entered vehicle number is already exist");
            req.getRequestDispatcher("VehicleInsurance.jsp").forward(req, resp);
        }


    }

    @Override
    @SneakyThrows
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String submit = req.getParameter("submit");
        if ("clear".equalsIgnoreCase(submit)) {
            req.setAttribute("dto", null);
        } else {
            String vehicleNumber = req.getParameter("vehicleNumber");


                SearchDTO searchDTO = new SearchDTO(vehicleNumber);
                System.out.println("searchDTO --->" + searchDTO);

                Optional<VehicleInsuranceDTO> dto = vehicleInsuranceService.search(searchDTO);
                if (dto.isPresent()) {
                    req.setAttribute("dto", dto.get());

                } else {
                    req.setAttribute("vehicleerror", "vehicle number is not registered PLEASE click on Register");


                }
        }
        req.getRequestDispatcher("Search.jsp").forward(req, resp);
    }
}
