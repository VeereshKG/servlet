package com.xworkz.surveyapp.dao;

public class SurveyDAOImpl implements SurveyDAO{

    public SurveyDAOImpl(){
        System.out.println("  SurveyDAOImpl no-arg const......");
    }
    @Override
    public boolean save(Object surveyDTO) {
        System.out.println("running save in SurveyDAOImpl");
        return false;
    }
}
