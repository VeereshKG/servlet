package com.xworkz.coffee.service;

import com.xworkz.coffee.dto.CoffeeDTO;
import com.xworkz.coffee.dto.CustomerFeedBackDTO;

public interface CustomerFeedBackService {

    void validateAndSave(CustomerFeedBackDTO customerFeedBackDTO);
}
