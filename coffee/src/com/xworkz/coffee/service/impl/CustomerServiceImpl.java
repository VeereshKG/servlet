package com.xworkz.coffee.service.impl;

import com.xworkz.coffee.dto.CustomerDTO;
import com.xworkz.coffee.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {
    @Override
    public void validateAndSave(CustomerDTO customerDTO) {
        System.out.println("validateAndSave method Override in CustomerServiceImpl");
    }
}
