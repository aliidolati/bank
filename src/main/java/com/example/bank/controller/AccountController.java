package com.example.bank.controller;


import com.example.bank.convertor.AccountConvertor;
import com.example.bank.model.dto.DepositRequest;
import com.example.bank.model.dto.WithdrawRequest;
import com.example.bank.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/home")
public class AccountController {
    private final AccountService service ;
    private final AccountConvertor convertor ;
    @PostMapping("/deposit")
    public void deposit(@RequestBody DepositRequest request) {
        service.deposit(request.getAmount(), request.getAccountNumber());
    }
    @PostMapping("/withdraw")
    public void withdraw(@RequestBody WithdrawRequest request) {
        service.withdraw(convertor.convertDto(request),request.getAmount());
    }
}
