package com.xworkz.iplbidingapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompanyDTO {

    private String email;
    private String company;

    public CompanyDTO(String email){
        this.email = email;
    }

    public  void getCompany(String company){

    }
}
