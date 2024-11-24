package com.jb.flyway_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HeloController {

    @Autowired
    private UserRepo userRepo;

    @GetMapping
    public String helo() {
        return "Hello World!";
    }

    @GetMapping("/users")
    public List<User> findAll() {
        try{
            System.out.println(userRepo.findAll().size());
        return userRepo.findAll();
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

}
