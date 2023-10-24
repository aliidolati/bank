package com.example.bank.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DepositRequest {
    private String accountNumber ;
    private Integer amount ;

}
