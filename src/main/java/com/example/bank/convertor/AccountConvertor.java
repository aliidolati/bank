package com.example.bank.convertor;

import com.example.bank.model.dto.WithdrawRequest;
import com.example.bank.model.entity.Account;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AccountConvertor extends BaseConvertor<Account , WithdrawRequest> {
}
