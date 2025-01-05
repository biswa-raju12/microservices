package com.biswapractice.Accounts.Entity;

import jakarta.persistence.*;

@Entity
public class Accounts {

    @Column(name = "customer_id")
    private Long customerId;

    @Column(name = "account_id")
    @Id
    private Long accountId;

    @Column(name = "account_number")
    private Long accountNumber;

    @Column(name = "account_type")
    private Long accountType;

    @Column(name = "brach_address")
    private String branchAddress;
}
