package com.xworkz.iplbidingapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BidDTO {

    private   String companyName;
   private double price;
}
