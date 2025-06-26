package com.pcs.service.customer.service.service;

import com.pcs.service.customer.service.mapper.PartyToPartyDTOMapper;
import com.pcs.service.customer.service.dto.PartyPublicDTO;
import com.pcs.service.customer.service.entity.Party;
import com.pcs.service.customer.service.repository.PartyRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PartyService {

    private final PartyRepository partyRepository;
    private final PartyToPartyDTOMapper partyToPartyDTOMapper;

    public PartyService(PartyRepository partyRepository, PartyToPartyDTOMapper partyToPartyDTOMapper){
        this.partyRepository = partyRepository;
        this.partyToPartyDTOMapper = partyToPartyDTOMapper;
    }
    public List<PartyPublicDTO> getAllParties(){
        List<Party> allParties = partyRepository.findAll();

        return allParties.stream()
                .map(partyToPartyDTOMapper::mapPartyToPartyPublicDTO)
                .collect(Collectors.toList());
    }
}
