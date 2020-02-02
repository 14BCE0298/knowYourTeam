package com.sharma.vishal.knowYourTeam10.controllers;

import com.sharma.vishal.knowYourTeam10.dtos.AppUserDto;
import com.sharma.vishal.knowYourTeam10.models.AppUser;
import com.sharma.vishal.knowYourTeam10.services.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/")
    public AppUser saveUserDetails(@RequestBody AppUserDto appUserDto) {
        return service.saveUserDetails(appUserDto);
    }
}
