package com.example.bank.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WithdrawRequest {
    private String accountNumber ;
    private Integer cvv2 ;
    private Integer amount ;
    private String dynamicPassword ;
}
