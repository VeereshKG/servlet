package com.xworkz.insurance.exception;

public class DataNotSavedException extends Exception {
    public DataNotSavedException(String errormessage) {
        super(errormessage);
    }
}
