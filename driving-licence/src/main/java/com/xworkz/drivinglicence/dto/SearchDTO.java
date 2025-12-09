package com.xworkz.drivinglicence.dto;

import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor

public class SearchDTO implements Serializable, Comparable<Long> {

    public SearchDTO() {
        System.out.println("Running in searchDTO");
    }

    private long aadhar;


    @Override
    public int compareTo(Long o) {
        return 0;
    }
}


