package com.xworkz.iplbidingapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlayerDTO implements Serializable , Comparable<String> {

    private String playerName;
    private int age;
    private String playerType;
    private String state;
    private double battingAvg;
    private double bowlingAvg;
    private int stumps;



    @Override
    public int compareTo(String o) {
        return 0;
    }
}
