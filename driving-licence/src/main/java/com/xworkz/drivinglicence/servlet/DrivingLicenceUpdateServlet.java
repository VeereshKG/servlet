package com.xworkz.drivinglicence.servlet;

import com.xworkz.drivinglicence.dto.DrivingLicenceDTO;
import com.xworkz.drivinglicence.dto.SearchDTO;
import com.xworkz.drivinglicence.exception.DataInvalidException;
import com.xworkz.drivinglicence.service.DrivingLicenceService;
import com.xworkz.drivinglicence.service.DrivingLicenceServiceImpl;
import lombok.SneakyThrows;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@WebServlet(urlPatterns = "/edit", loadOnStartup = 1)
public class DrivingLicenceUpdateServlet extends HttpServlet {

    DrivingLicenceService service = new DrivingLicenceServiceImpl();

    public DrivingLicenceUpdateServlet() {
        System.out.println("DrivingLicenceUpdateServlet is created");
    }

    @Override
    @SneakyThrows
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("Running doGet in DrivingLicenceUpdateServlet");

        String aadhar = req.getParameter("AadharNo");



        SearchDTO searchDTO = new SearchDTO(Long.parseLong(aadhar));

        try {
            Optional<DrivingLicenceDTO> optionalDTO = service.search(searchDTO);

                req.setAttribute("updateDTO", optionalDTO.get());
                System.out.println("Forwarding to DrivingLicenceUpdate.jsp");
                req.getRequestDispatcher("DrivingLicenceUpdate.jsp").forward(req, resp);


        }catch (DataInvalidException e){

        }
    }
}
