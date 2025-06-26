package com.pcs.service.customer.service.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Party")
public class Party {

    private final String id;
    private final String name;
    private final String pan;
    @Column(name = "account_no")
    private final String accountNo;
    @Column(name = "branch_code")
    private final String branchCode;
    @Column(name = "mobile_no")
    private final String mobileNo;
    private final String address;
    @Column (name = "email_id")
    private final String emailId;
    @Column (name = "party_type")
    private final String party_type;

    public Party(String id, String name, String pan, String accountNo, String branchCode, String mobileNo, String address, String emailId, String party_type) {
        this.id = id;
        this.name = name;
        this.pan = pan;
        this.accountNo = accountNo;
        this.branchCode = branchCode;
        this.mobileNo = mobileNo;
        this.address = address;
        this.emailId = emailId;
        this.party_type = party_type;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPan() {
        return pan;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public String getAddress() {
        return address;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getParty_type() {
        return party_type;
    }
}
