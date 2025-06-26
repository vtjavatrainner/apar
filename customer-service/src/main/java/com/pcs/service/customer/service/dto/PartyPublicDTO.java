package com.pcs.service.customer.service.dto;

public class PartyPublicDTO {

    private final String name;
    private final String mobileNo;
    private final String emailId;

    public PartyPublicDTO(String name, String mobileNo, String emailId) {
        this.name = name;
        this.mobileNo = mobileNo;
        this.emailId = emailId;
    }

    public String getName() {
        return name;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public String getEmailId() {
        return emailId;
    }
}
