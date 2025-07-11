package com.pcs.service.processing.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class InvoiceDTO {
    private Long id;
    private String buyerPartyId;
    private String supplierPartyId;
    private BigDecimal amount;
    private LocalDate invoiceDate;
    private LocalDate maturityDate;
    private String description;
}
