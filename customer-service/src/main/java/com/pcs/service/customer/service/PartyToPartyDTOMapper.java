package com.pcs.service.customer.service;

import com.pcs.service.customer.service.dto.PartyPublicDTO;
import com.pcs.service.customer.service.entity.Party;

public class PartyToPartyDTOMapper {

    public PartyPublicDTO mapPartyToPartyPublicDTO(final Party party){
        return new PartyPublicDTO(party.getName(), party.getMobileNo(), party.getEmailId());
    }
}
