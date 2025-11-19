package com.xworkz.surveyapp.service;

import com.xworkz.surveyapp.dto.SurveyDTO;
import com.xworkz.surveyapp.exception.DataInValidException;

public interface SurveyService {

    void validateAndSave(SurveyDTO surveyDTO) throws DataInValidException;
}
