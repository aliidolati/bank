package com.example.bank.service;

import com.example.bank.model.entity.User;
import com.example.bank.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService extends AbstractService<UserRepository, User> {
    private final UserRepository repository ;
    private final AccountService accountService ;
    public void createUser(User user) {
        accountService.createAccount(user) ;
        repository.save(user) ;
    }
    public User findByEmail(String email) {
        return repository.findUserByEmail(email) ;
    }
}
