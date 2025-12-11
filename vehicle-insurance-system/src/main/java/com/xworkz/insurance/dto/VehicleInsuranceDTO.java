package com.xworkz.insurance.dto;


import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString

public class VehicleInsuranceDTO implements Serializable, Comparable<String> {

    private  int id;
    private String ownerName;
    private String vehicleNumber;
    private String vehicleType;
    private String InsuranceType;
    private double amount;


    @Override
    public int compareTo(String o) {
        return 0;
    }
}
