package com.biswapractice.Accounts.repository;

import com.biswapractice.Accounts.Entity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository  extends JpaRepository<Accounts,Long> {
}
