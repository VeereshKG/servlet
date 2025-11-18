package com.xworkz.coffee.service.impl;

import com.xworkz.coffee.dto.CoffeeLandDTO;
import com.xworkz.coffee.service.CoffeeLandService;

public class CoffeeLandServiceImpl implements CoffeeLandService {
    @Override
    public void validateAndSave(CoffeeLandDTO coffeeLandDTO) {
        System.out.println("validateAndSave method Override in CoffeeLandServiceImpl");
    }
}
