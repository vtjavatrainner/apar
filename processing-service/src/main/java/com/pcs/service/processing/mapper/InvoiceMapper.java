package com.pcs.service.processing.mapper;


import com.pcs.service.processing.dto.InvoiceDTO;
import com.pcs.service.processing.entity.Invoice;

public class InvoiceMapper {

    public static Invoice toEntity(InvoiceDTO dto) {
        Invoice invoice = new Invoice();
        invoice.setId(dto.getId());
        invoice.setBuyerPartyId(dto.getBuyerPartyId());
        invoice.setSupplierPartyId(dto.getSupplierPartyId());
        invoice.setAmount(dto.getAmount());
        invoice.setInvoiceDate(dto.getInvoiceDate());
        invoice.setMaturityDate(dto.getMaturityDate());
        invoice.setDescription(dto.getDescription());
        return invoice;
    }

    public static InvoiceDTO toDTO(Invoice invoice) {
        InvoiceDTO dto = new InvoiceDTO();
        dto.setId(invoice.getId());
        dto.setBuyerPartyId(invoice.getBuyerPartyId());
        dto.setSupplierPartyId(invoice.getSupplierPartyId());
        dto.setAmount(invoice.getAmount());
        dto.setInvoiceDate(invoice.getInvoiceDate());
        dto.setMaturityDate(invoice.getMaturityDate());
        dto.setDescription(invoice.getDescription());
        return dto;
    }
}
