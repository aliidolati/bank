package com.example.bank.convertor;

import com.example.bank.model.dto.UserDto;
import com.example.bank.model.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserConvertor extends BaseConvertor<User, UserDto> {

}
