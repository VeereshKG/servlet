package com.xworkz.iplbidingapp.service;

import com.xworkz.iplbidingapp.dto.CompanyDTO;
import com.xworkz.iplbidingapp.dto.PlayerDTO;
import com.xworkz.iplbidingapp.dto.SearchDTO;
import com.xworkz.iplbidingapp.exception.DataInvalidException;
import com.xworkz.iplbidingapp.exception.DataNotSavedException;

import java.util.List;
import java.util.Optional;

public interface PlayerService {

     boolean validateAndSave(PlayerDTO dto) throws DataInvalidException, DataNotSavedException;

    Optional<CompanyDTO> validateEmail(CompanyDTO companyDTO) throws DataInvalidException;

     List<PlayerDTO> searchForPlayers(SearchDTO searchDTO) ;

    boolean placeBid(String playerName, String companyName, double amount);
}
