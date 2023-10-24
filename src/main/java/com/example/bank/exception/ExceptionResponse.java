package com.example.bank.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExceptionResponse {
    private boolean error;
    private String message;
}
