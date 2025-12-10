package com.xworkz.insurance.constants;

public enum DBConstant {

    URL("jdbc:mysql://localhost:3306/jdbc"),
    USERNAME("root"),
    PASSWORD("Veeresh@2002");


    private String propertis;

    private DBConstant(String propertis) {
        this.propertis = propertis;
        System.out.println("running in DBConstant constructor");
    }

    public String getPropertis() {
        return propertis;
    }
}
