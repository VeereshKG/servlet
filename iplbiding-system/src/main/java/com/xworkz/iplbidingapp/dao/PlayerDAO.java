package com.xworkz.iplbidingapp.dao;

import com.xworkz.iplbidingapp.dto.BidDTO;
import com.xworkz.iplbidingapp.dto.CompanyDTO;
import com.xworkz.iplbidingapp.dto.PlayerDTO;
import com.xworkz.iplbidingapp.dto.SearchDTO;

import java.util.List;
import java.util.Optional;

public interface PlayerDAO {

  void   save(PlayerDTO dto);

   boolean nameCheck(PlayerDTO playerDTO);

  Optional<CompanyDTO> searchByEmail(CompanyDTO companyDTO);

   List<PlayerDTO> searchForPlayers(SearchDTO searchDTO);

    boolean saveBidAmount(String playerName, String companyName, double amount);

    boolean incrementBidCount(String playerName);
    int getBidCount(String playerName);
    boolean markSold(String playerName);

    BidDTO getHighestBid(String playerName);
}
