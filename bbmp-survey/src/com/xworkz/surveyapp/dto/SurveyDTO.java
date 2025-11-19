package com.xworkz.surveyapp.dto;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class SurveyDTO implements Serializable, Comparable<String> {

    private String name;
    private String occupation;
    private String education;
    private String nativePlace;
    private int age;
    private String dob;
    private String gender;
    private String motherTongue;
    private String religion;
    private String caste;
    private long mobile;
    private String friendName;
    private int shoeSize;
    private int noOfShoes;

    private String fatherName;
    private String motherName;
    private String married;
    private String spouseName;
    private int noOfChildren;
    private int familyMembers;

    private long aadhar;
    private String pan;
    private String voterId;
    private String passport;
    private long rationCard;

    private String bikeNo;
    private String carNo;
    private int noOfCycles;

    private String land;
    private int sites;
    private String gold;
    private String silver;
    private String laptop;
    private String tv;
    private String shareHolding;

    private double income;
    private long bankAccountNo;
    private String insuranceCompany;
    private String insuranceNo;

    private String diseases;
    private String bloodGroup;
    private String disabled;

    private String taxes;
    private String electricityBill;
    private String waterBill;
    private String buildingOwner;
    private String crop;
    private String rtc;

    private long loanNo;
    private double loanBalance;
    private String loanType;

    private String petName;
    private int noOfCows;

    @Override
    public int compareTo(String o) {
        return this.name.compareTo(o);
    }
}
