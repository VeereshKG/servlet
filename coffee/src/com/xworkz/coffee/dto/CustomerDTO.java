package com.xworkz.coffee.dto;

import lombok.*;

import java.io.Serializable;

@ToString
@EqualsAndHashCode
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class CustomerDTO implements Serializable, Comparable<String> {

    private String name;
    private long mobile;
    private String flavour;
    private int quantity;
    private String payment;

    @Override
    public int compareTo(String o) {
        return this.name.compareTo(name);
    }
}
