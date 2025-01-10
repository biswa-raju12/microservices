package com.biswapractice.Accounts.dto;

import lombok.Data;

public class CustomerDTO {

    private String name;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public CustomerDTO() {
    }

    public CustomerDTO(String name, String email, String mobileNumber) {
        this.name = name;
        this.email = email;
        this.mobileNumber = mobileNumber;
    }

    private String mobileNumber;
    private AccountsDTO accountsDto;

    public AccountsDTO getAccountsDto() {
        return accountsDto;
    }

    public void setAccountsDto(AccountsDTO accountsDto) {
        this.accountsDto = accountsDto;
    }
}
