package com.pcs.service.customer.service.repository;

import com.pcs.service.customer.service.entity.Party;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartyRepository extends JpaRepository<Party, String> {
}
