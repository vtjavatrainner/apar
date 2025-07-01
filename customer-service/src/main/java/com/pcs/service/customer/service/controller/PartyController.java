package com.pcs.service.customer.service.controller;

import com.pcs.service.customer.service.dto.PartyPublicDTO;
import com.pcs.service.customer.service.service.PartyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
//CRUD operations for party table
// Get /party
// Get /party/id/1
// Post /party
// Put /party
// Delete /party/id/1
@RestController
@RequestMapping("/party")
public class PartyController {

    private final PartyService partyService;

    public PartyController(final PartyService partyService){
        this.partyService = partyService;
    }


    @GetMapping
    public ResponseEntity<List<PartyPublicDTO>> findAll(){
        List<PartyPublicDTO> allParties = partyService.findAll();
        return ResponseEntity.ok(allParties);
    }


}
