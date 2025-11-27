package com.xworkz.app.dto;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class MatrimonyDTO implements Serializable, Comparable {


    private String email;
    private String forWhom;
    private String gender;
    private String dateOfBirth;
    private String motherTongue;
    private String religion;
    private String status;
    private String height;


    @Override
    public int compareTo(Object o) {
        return this.email.compareTo(email);
    }

}
