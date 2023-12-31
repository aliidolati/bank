package com.example.bank.repository;

import com.example.bank.model.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account,String> {
     Account findAccountByAccountNumber(String accountNumber) ;

}
