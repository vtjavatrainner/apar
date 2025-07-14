package com.pcs.service.processing.invoice.controller;

import com.pcs.service.processing.invoice.dto.InvoiceDTO;
import com.pcs.service.processing.invoice.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/invoice")
public class InvoiceController {

    @Autowired
    InvoiceService invoiceService;

    @GetMapping
    public ResponseEntity<List<InvoiceDTO>> getAllInvoices(){
        List<InvoiceDTO> invoiceDTOList = invoiceService.getAllInvoices();
        if(invoiceDTOList.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(invoiceDTOList);
    }
}
