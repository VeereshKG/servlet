package com.xworkz.coffee.dto;

import lombok.*;

import java.io.Serializable;

@ToString
@EqualsAndHashCode
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class CoffeeDTO implements Serializable, Comparable<String> {

    private String type;
    private Double price;
    private Double quantity;
    private String farmer;
    private String location;
    private int zip;


    @Override
    public int compareTo(String o) {
        return this.type.compareTo(o);

    }
}
