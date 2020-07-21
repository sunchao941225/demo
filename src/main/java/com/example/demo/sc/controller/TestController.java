package com.example.demo.sc.controller;

import com.example.demo.sc.entity.Persons;
import com.example.demo.sc.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class TestController {
    @Autowired
    private TestService testService;

    @GetMapping("list")
    public List<Persons> getUser(Model model){
        return testService.getUser();
    }

    @RequestMapping("/hello")
    public String say(){
        return "hello sc";
    }
}
