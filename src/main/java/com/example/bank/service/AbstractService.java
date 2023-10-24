package com.example.bank.service;

import org.springframework.data.jpa.repository.JpaRepository;

public class AbstractService<R extends JpaRepository<E , String>,E> {

}
