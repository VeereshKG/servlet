package com.xworkz.surveyapp.servlet;

import com.xworkz.surveyapp.dto.SurveyDTO;
import com.xworkz.surveyapp.exception.DataInValidException;
import com.xworkz.surveyapp.service.SurveyService;
import com.xworkz.surveyapp.service.SurveyServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/survey", loadOnStartup = 1)
public class SurveyServlet extends HttpServlet {

    private SurveyService service = new SurveyServiceImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("Get Parameter");

        String name = request.getParameter("name");
        String occupation = request.getParameter("occupation");
        String education = request.getParameter("education");
        String nativePlace = request.getParameter("nativePlace");
        String age = request.getParameter("age");
        String dob = request.getParameter("dob");
        String gender = request.getParameter("gender");
        String motherTongue = request.getParameter("motherTongue");
        String religion = request.getParameter("religion");
        String caste = request.getParameter("caste");
        String mobile = request.getParameter("mobile");
        String friends = request.getParameter("friends");
        String shoeSize = request.getParameter("shoeSize");
        String shoes = request.getParameter("shoes");

        String fatherName = request.getParameter("fatherName");
        String motherName = request.getParameter("motherName");
        String married = request.getParameter("married");
        String spouseName = request.getParameter("spouseName");
        String children = request.getParameter("children");
        String familyMembers = request.getParameter("familyMembers");

        String aadhar = request.getParameter("aadhar");
        String pan = request.getParameter("pan");
        String voterId = request.getParameter("voterId");
        String passport = request.getParameter("passport");
        String rationCard = request.getParameter("rationCard");

        String bikeNo = request.getParameter("bikeNo");
        String carNo = request.getParameter("carNo");
        String cycles = request.getParameter("cycles");

        String land = request.getParameter("land");
        String sites = request.getParameter("sites");
        String gold = request.getParameter("gold");
        String silver = request.getParameter("silver");
        String laptop = request.getParameter("laptop");
        String tv = request.getParameter("tv");
        String shareHolding = request.getParameter("shareHolding");

        String income = request.getParameter("income");
        String bankAccount = request.getParameter("bankAccount");
        String insuranceCompany = request.getParameter("insuranceCompany");
        String insuranceNo = request.getParameter("insuranceNo");

        String diseases = request.getParameter("diseases");
        String bloodGroup = request.getParameter("bloodGroup");
        String disabled = request.getParameter("disabled");

        String rtc = request.getParameter("rtc");
        String taxes = request.getParameter("taxes");
        String electricityBill = request.getParameter("electricityBill");
        String waterBill = request.getParameter("waterBill");
        String buildingOwner = request.getParameter("buildingOwner");
        String crop = request.getParameter("crop");

        String loanNo = request.getParameter("loanNo");
        String loanBalance = request.getParameter("loanBalance");
        String loanType = request.getParameter("loanType");

        String pet = request.getParameter("pet");
        String cows = request.getParameter("cows");

        try {


            System.out.println("Instance Of SurveyDTO");
            SurveyDTO surveyDTO = new SurveyDTO(name, occupation, education, nativePlace, Integer.parseInt(age), dob, gender, motherTongue, religion, caste, Long.parseLong(mobile), friends, Integer.parseInt(shoeSize)
                    , Integer.parseInt(shoes), fatherName, motherName, married, spouseName, Integer.parseInt(children), Integer.parseInt(familyMembers), Long.parseLong(aadhar), pan, voterId, passport, Long.parseLong(rationCard)
                    , bikeNo, carNo, Integer.parseInt(cycles), land, Integer.parseInt(sites), gold, silver, laptop, tv, shareHolding, Double.parseDouble(income), Long.parseLong(bankAccount), insuranceCompany, insuranceNo
                    , diseases, bloodGroup, disabled, taxes, electricityBill, waterBill, buildingOwner, crop, rtc, Long.parseLong(loanNo), Double.parseDouble(loanBalance), loanType, pet, Integer.parseInt(cows));
            System.out.println("SurveyDto--->" + surveyDTO);

            service.validateAndSave(surveyDTO);

            System.out.println("Setting Attribute");
            request.setAttribute("name", name);
            request.setAttribute("occupation", occupation);
            request.setAttribute("education", education);
            request.setAttribute("nativePlace", nativePlace);
            request.setAttribute("age", age);
            request.setAttribute("dob", dob);
            request.setAttribute("gender", gender);
            request.setAttribute("motherTongue", motherTongue);
            request.setAttribute("religion", religion);
            request.setAttribute("caste", caste);
            request.setAttribute("mobile", mobile);
            request.setAttribute("friends", friends);
            request.setAttribute("shoeSize", shoeSize);
            request.setAttribute("shoes", shoes);

            request.setAttribute("fatherName", fatherName);
            request.setAttribute("motherName", motherName);
            request.setAttribute("married", married);
            request.setAttribute("spouseName", spouseName);
            request.setAttribute("children", children);
            request.setAttribute("familyMembers", familyMembers);

            request.setAttribute("aadhar", aadhar);
            request.setAttribute("pan", pan);
            request.setAttribute("voterId", voterId);
            request.setAttribute("passport", passport);
            request.setAttribute("rationCard", rationCard);

            request.setAttribute("bikeNo", bikeNo);
            request.setAttribute("carNo", carNo);
            request.setAttribute("cycles", cycles);

            request.setAttribute("land", land);
            request.setAttribute("sites", sites);
            request.setAttribute("gold", gold);
            request.setAttribute("silver", silver);
            request.setAttribute("laptop", laptop);
            request.setAttribute("tv", tv);
            request.setAttribute("shareHolding", shareHolding);

            request.setAttribute("income", income);
            request.setAttribute("bankAccount", bankAccount);
            request.setAttribute("insuranceCompany", insuranceCompany);
            request.setAttribute("insuranceNo", insuranceNo);

            request.setAttribute("diseases", diseases);
            request.setAttribute("bloodGroup", bloodGroup);
            request.setAttribute("disabled", disabled);

            request.setAttribute("rtc", rtc);
            request.setAttribute("taxes", taxes);
            request.setAttribute("electricityBill", electricityBill);
            request.setAttribute("waterBill", waterBill);
            request.setAttribute("buildingOwner", buildingOwner);
            request.setAttribute("crop", crop);

            request.setAttribute("loanNo", loanNo);
            request.setAttribute("loanBalance", loanBalance);
            request.setAttribute("loanType", loanType);

            request.setAttribute("pet", pet);
            request.setAttribute("cows", cows);


            request.setAttribute("success", "Data Saved Successfully");
        }catch (DataInValidException e){
            request.setAttribute("error", "Data not saved");

        }

        System.out.println("Forwarding to SurveyResult.jsp");
        request.getRequestDispatcher("SurveyResult.jsp").forward(request, response);
    }
}
