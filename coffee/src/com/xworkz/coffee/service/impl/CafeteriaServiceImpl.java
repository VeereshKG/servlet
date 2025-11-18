package com.xworkz.coffee.service.impl;

import com.xworkz.coffee.dto.CafeteriaDTO;
import com.xworkz.coffee.service.CafeteriaService;

public class CafeteriaServiceImpl implements CafeteriaService {
    @Override
    public void validateAndSave(CafeteriaDTO cafeteriaDTO) {
        System.out.println("validateAndSave method Override in CafeteriaServiceImpl");
    }
}
