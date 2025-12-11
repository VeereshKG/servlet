package com.xworkz.insurance.servlet;

import com.xworkz.insurance.dto.SearchTypeDTO;
import com.xworkz.insurance.dto.VehicleInsuranceDTO;
import com.xworkz.insurance.service.VehicleInsuranceService;
import com.xworkz.insurance.service.VehicleInsuranceServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/type", loadOnStartup = 1)
public class SearchTypeServlet extends HttpServlet {

    VehicleInsuranceService service = new VehicleInsuranceServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.printf("Running doGet in SearchTypeServlet");

        String type = req.getParameter("vehicletype");

        SearchTypeDTO searchTypeDTO = new SearchTypeDTO();
        searchTypeDTO.setVehicleType(type);

        System.out.println("searchTypeDTO-->" + searchTypeDTO);

        List<VehicleInsuranceDTO> dtos = service.findByType(searchTypeDTO);

        if (dtos != null) {
            req.setAttribute("dtoList", dtos);
            req.getRequestDispatcher("SearchByVehicleType.jsp").forward(req, resp);
        } else {
            req.setAttribute("errormsg", "Entered VehicleType is Not Found");
            req.getRequestDispatcher("SearchByVehicleType.jsp").forward(req, resp);
        }


    }
}
