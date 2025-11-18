package com.xworkz.coffee.dto;

import java.io.Serializable;
import java.util.Objects;

public class CafeteriaDTO implements Serializable, Comparable<Double> {


    private String name;
    private String location;
    private String type;
    private double price;
    private String franchise;
    private String owner;
    private String gstNo;

    public CafeteriaDTO() {

    }

    public CafeteriaDTO(String name, String location, String type, double price, String franchise, String owner, String gstNo) {
        this.name = name;
        this.location = location;
        this.type = type;
        this.price = price;
        this.franchise = franchise;
        this.owner = owner;
        this.gstNo = gstNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setFranchise(String franchise) {
        this.franchise = franchise;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setGstNo(String gstNo) {
        this.gstNo = gstNo;
    }

    public String getOwner() {
        return owner;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getFranchise() {
        return franchise;
    }

    public String getGstNo() {
        return gstNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CafeteriaDTO)) return false;
        CafeteriaDTO that = (CafeteriaDTO) o;
        return Double.compare(price, that.price) == 0 && Objects.equals(name, that.name) && Objects.equals(location, that.location) && Objects.equals(type, that.type) && Objects.equals(franchise, that.franchise) && Objects.equals(owner, that.owner) && Objects.equals(gstNo, that.gstNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location, type, price, franchise, owner, gstNo);
    }

    @Override
    public String toString() {
        return "CafeteriaDTO{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", franchise='" + franchise + '\'' +
                ", owner='" + owner + '\'' +
                ", gstNo='" + gstNo + '\'' +
                '}';
    }

    @Override
    public int compareTo(Double o) {
        return (int) (this.price - o.compareTo(price));
    }
}
