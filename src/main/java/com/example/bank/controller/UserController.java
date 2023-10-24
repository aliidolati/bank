package com.example.bank.controller;

import com.example.bank.convertor.BaseConvertor;
import com.example.bank.model.dto.UserDto;
import com.example.bank.model.entity.User;
import com.example.bank.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final BaseConvertor<User, UserDto> convertor ;
    private final UserService service ;

    @PostMapping("/register")
    public void register(@RequestBody UserDto userDto) {
        service.createUser(convertor.convertDto(userDto));
    }
}
