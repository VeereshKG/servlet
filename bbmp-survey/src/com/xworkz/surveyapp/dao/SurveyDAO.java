package com.xworkz.surveyapp.dao;

import com.xworkz.surveyapp.dto.SurveyDTO;

public interface SurveyDAO<T> {

    boolean save(T surveyDTO);
}
