package com.xworkz.coffee.dto;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString

public class CoffeeLandDTO implements Serializable, Comparable<String> {

    private int size;
    private String plant;
    private String yeild;
    private double exp;
    private double profit;
    private int fertilizer;
    private String check;


    @Override
    public int compareTo(String o) {
        return this.plant.compareTo(plant);
    }
}
