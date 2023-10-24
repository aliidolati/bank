package com.example.bank.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Account extends AbstractEntity {
    @Column(unique = true , nullable = false)
    private String accountNumber ;
    @Column(nullable = false)
    private Integer cvv2 ;
    private Integer password ;
    private Integer balance ;
    @ManyToOne(cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user ;
}
