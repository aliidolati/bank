package com.example.bank.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Entity
@Getter
@Setter
public class User extends AbstractEntity{
    private String firstName ;
    private String lastName ;
    @Column(unique = true)
    private String nationalCode ;
    private String email ;
    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER , cascade = CascadeType.ALL)
    private List<Account> accounts ;
}
