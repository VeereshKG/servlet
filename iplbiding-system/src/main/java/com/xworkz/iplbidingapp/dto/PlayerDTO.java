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
    private boolean sold;

    private String soldCompany;
    private Double soldAmount;



    public PlayerDTO(String playerName, int i, String playerType, String state, double v, double v1, int i1) {
        this.playerName = playerName;
        this.age = i;
        this.playerType = playerType;
        this.state = state;
        this.battingAvg = v;
        this.bowlingAvg = v1;
        this.stumps = i1;


    }


    @Override
    public int compareTo(String o) {
        return 0;
    }
}
