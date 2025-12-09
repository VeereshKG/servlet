package com.xworkz.drivinglicence.dto;

import lombok.*;

import java.io.Serializable;


@AllArgsConstructor
@Getter
@Setter
@ToString
public class DrivingLicenceDTO implements Serializable, Comparable<String> {

    private String name;
    private int age;
    private String address;
    private long aadhar;
    private long mobile;

    public DrivingLicenceDTO() {
        System.out.println("Running in DrivingLicenceDTO");
    }

    @Override
    public int compareTo(String o) {
        return 0;
    }
}
