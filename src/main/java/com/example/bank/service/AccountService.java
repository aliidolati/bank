package com.example.bank.service;

import com.example.bank.model.entity.Account;
import com.example.bank.model.entity.User;
import com.example.bank.repository.AccountRepository;
import com.example.bank.service.email.EmailSender;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@RequiredArgsConstructor
public class AccountService extends AbstractService<AccountRepository , Account> {
    private final AccountRepository repository ;
    private final EmailSender emailSender ;
    public void createAccount(User user) {
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<16; i++) {
            sb.append(rnd.nextInt(10));
        }
        String accountNumber = sb.toString();
        Integer cvv2 = rnd.nextInt(9000) + 1000;
        Account account = Account.builder()
                .accountNumber(accountNumber)
                .cvv2(cvv2)
                .balance(0)
                .user(user)
                .build();
        repository.save(account) ;
    }
    public void deposit(Integer amount , String accountNumber) {
        Account account = repository.findAccountByAccountNumber(accountNumber);
        account.setBalance(account.getBalance()+ amount);
        //emailSender.sendEmail(account.getUser().getEmail(),"test","teeestt");
        repository.save(account) ;
    }
    public void withdraw(Account account , Integer amount){

    }
}
