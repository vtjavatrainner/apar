package com.pcs.service.processing.service;


import com.pcs.service.processing.dto.InvoiceDTO;
import com.pcs.service.processing.entity.Invoice;
import com.pcs.service.processing.mapper.InvoiceMapper;
import com.pcs.service.processing.repository.InvoiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class InvoiceService {

    private final InvoiceRepository invoiceRepository;

    public InvoiceDTO createInvoice(InvoiceDTO dto) {
        Invoice invoice = InvoiceMapper.toEntity(dto);
        return InvoiceMapper.toDTO(invoiceRepository.save(invoice));
    }

    public List<InvoiceDTO> getAllInvoices() {
        return invoiceRepository.findAll()
                .stream()
                .map(InvoiceMapper::toDTO)
                .collect(Collectors.toList());
    }

    public Optional<InvoiceDTO> getInvoiceById(Long id) {
        return invoiceRepository.findById(id).map(InvoiceMapper::toDTO);
    }

    public void deleteInvoice(Long id) {
        invoiceRepository.deleteById(id);
    }
}
