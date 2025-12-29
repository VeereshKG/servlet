package com.xworkz.iplbidingapp.service;

import com.xworkz.iplbidingapp.dao.PlayerDAO;
import com.xworkz.iplbidingapp.dao.PlayerDAOImpl;
import com.xworkz.iplbidingapp.dto.CompanyDTO;
import com.xworkz.iplbidingapp.dto.PlayerDTO;
import com.xworkz.iplbidingapp.dto.SearchDTO;
import com.xworkz.iplbidingapp.exception.DataInvalidException;
import com.xworkz.iplbidingapp.exception.DataNotSavedException;

import java.util.List;
import java.util.Optional;

public class PlayerServiceImpl implements PlayerService {

    PlayerDAO playerDAO = new PlayerDAOImpl();

    @Override
    public boolean validateAndSave(PlayerDTO playerDTO) throws DataInvalidException, DataNotSavedException {
        boolean isInvalid = false;

        if (playerDTO.getPlayerName() == null
                || playerDTO.getPlayerName().length() < 3) {
            isInvalid = true;
        } else if (playerDTO.getAge() < 10 || playerDTO.getAge() > 60) {
            isInvalid = true;
        } else if (playerDTO.getState() == null
                || playerDTO.getState().length() < 2) {
            isInvalid = true;

        }


        if (isInvalid) {
            throw new DataInvalidException("Player Registration Data is Invalid");
        } else {
            if (!playerDAO.nameCheck(playerDTO)) {
                playerDAO.save(playerDTO);
            } else {
                System.out.println("name not matched");
                throw new DataNotSavedException("data not saved exception");
            }
        }
        return isInvalid;
    }


    @Override
    public Optional<CompanyDTO> validateEmail(CompanyDTO companyDTO) throws DataInvalidException {
        boolean isInvalid = false;
        if (companyDTO.getEmail() == null
                || companyDTO.getEmail().length() < 10
                || !companyDTO.getEmail().endsWith("@ipl.com")) {
            isInvalid = true;
        }

        if (isInvalid) {
            throw new DataInvalidException("Email is Invalid, Please Enter Email like companyName@ipl.com");
        } else {
            System.out.println("invoking playerDAO");
            return playerDAO.searchByEmail(companyDTO);
        }
    }
    @Override
    public List<PlayerDTO> searchForPlayers(SearchDTO searchDTO) {

        boolean invalid = false;

        if (searchDTO != null) {
            if (searchDTO.getPlayerType() == null || searchDTO.getPlayerType().isEmpty()) {
                invalid = true;
            }
            if (searchDTO.getBattingAvg() < 0) invalid = true;
            if (searchDTO.getBowlingAvg() < 0) invalid = true;
            if (searchDTO.getStumps() < 0) invalid = true;
        }

        if (!invalid) {
            return playerDAO.searchForPlayers(searchDTO);
        }
        return null;
    }


    @Override
    public boolean placeBid(String playerName, String companyName, double amount) {
        System.out.println("Stating placeBid");
        boolean saved = playerDAO.saveBidAmount(playerName,companyName,amount);

        if (saved) {
            playerDAO.incrementBidCount(playerName);

            int count = playerDAO.getBidCount(playerName);
            if (count >= 3) {
                playerDAO.markSold(playerName);
            }
        }
        return saved;
    }
}