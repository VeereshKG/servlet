package com.xworkz.coffee.service.impl;

import com.xworkz.coffee.dto.CustomerFeedBackDTO;
import com.xworkz.coffee.service.CustomerFeedBackService;

public class CustomerFeedBackServiceImpl implements CustomerFeedBackService {
    @Override
    public void validateAndSave(CustomerFeedBackDTO customerFeedBackDTO) {
        System.out.println("validateAndSave method Override in CustomerFeedBackServiceImpl");
    }
}
