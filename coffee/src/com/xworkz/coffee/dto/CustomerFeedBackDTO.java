package com.xworkz.coffee.dto;

import lombok.*;

import java.io.Serializable;

@ToString
@EqualsAndHashCode
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class CustomerFeedBackDTO implements Serializable, Comparable<String> {

    private String name;
    private String email;
    private String comments;
    private int rating;

    @Override
    public int compareTo(String o) {
        return this.name.compareTo(o);
    }
}
