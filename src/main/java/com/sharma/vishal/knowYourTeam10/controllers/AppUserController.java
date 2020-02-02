package com.sharma.vishal.knowYourTeam10.controllers;

import com.sharma.vishal.knowYourTeam10.dtos.AppUserDto;
import com.sharma.vishal.knowYourTeam10.services.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/knowYourTeam")

public class AppUserController {

    private AppUserService service;

    @Autowired
    public AppUserController(AppUserService service) {
        this.service = service;
    }

    @GetMapping("/{userId}")
    public AppUserDto getUserById(@PathVariable("userId") String userId) {
        return service.getUserDetails(userId);
    }
}
