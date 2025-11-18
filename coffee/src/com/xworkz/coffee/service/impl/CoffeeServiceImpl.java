package com.xworkz.coffee.service.impl;

import com.xworkz.coffee.dto.CoffeeDTO;
import com.xworkz.coffee.service.CoffeeService;

public class CoffeeServiceImpl implements CoffeeService {
    @Override
    public void validateAndSave(CoffeeDTO coffeeDTO) {
        System.out.println("validateAndSave method Override in CoffeeServiceImpl");
    }
}
