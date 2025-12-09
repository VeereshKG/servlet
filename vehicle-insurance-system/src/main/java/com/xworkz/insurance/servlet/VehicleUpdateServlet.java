package com.xworkz.insurance.servlet;

import com.xworkz.insurance.dto.SearchDTO;
import com.xworkz.insurance.dto.VehicleInsuranceDTO;
import com.xworkz.insurance.exception.DataInvalidException;
import com.xworkz.insurance.service.VehicleInsuranceService;
import com.xworkz.insurance.service.VehicleInsuranceServiceImpl;
import lombok.SneakyThrows;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@WebServlet(urlPatterns = "/edit", loadOnStartup = 1)

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

        Optional<VehicleInsuranceDTO> vehicleInsuranceDTO = Optional.empty();

        try {
            vehicleInsuranceDTO = vehicleInsuranceService.search(searchDTO);

            req.setAttribute("updateDTO", vehicleInsuranceDTO.get());
            req.getRequestDispatcher("VehicleUpdate.jsp").forward(req, resp);

        } catch (DataInvalidException e) {
            req.setAttribute("error", e.getMessage());
            req.getRequestDispatcher("Search.jsp").forward(req, resp);
        }
    }
}