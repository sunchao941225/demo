package com.example.demo.sc.service;


import com.example.demo.sc.entity.Persons;
import com.example.demo.sc.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    @Autowired
    private TestRepository testRepository;

    public List<Persons> getUser(){
        return testRepository.findAll();
    }
}
