package com.pcs.service.processing.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "invoices")
@Data
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "buyer_party_id", nullable = false, length = 200)
    private String buyerPartyId;

    @Column(name = "supplier_party_id", nullable = false, length = 50)
    private String supplierPartyId;

    @Column(nullable = false, precision = 15, scale = 2)
    private BigDecimal amount;

    @Column(name = "invoice_date", nullable = false)
    private LocalDate invoiceDate;

    @Column(name = "maturity_date", nullable = false)
    private LocalDate maturityDate;

    @Column(columnDefinition = "TEXT")
    private String description;
}
