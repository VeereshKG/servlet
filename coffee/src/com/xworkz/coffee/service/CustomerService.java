package com.xworkz.coffee.service;

import com.xworkz.coffee.dto.CustomerDTO;

public interface CustomerService {

    void validateAndSave(CustomerDTO customerDTO);
}
