package com.xworkz.insurance.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchTypeDTO implements Serializable , Comparable<String> {

    private String vehicleType;

    @Override
    public int compareTo(String o) {
        return 0;
    }
}
