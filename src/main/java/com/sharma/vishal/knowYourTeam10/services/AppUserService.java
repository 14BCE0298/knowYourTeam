package com.sharma.vishal.knowYourTeam10.services;

import com.sharma.vishal.knowYourTeam10.dtos.AppUserDto;
import com.sharma.vishal.knowYourTeam10.mappers.AppUserMapper;
import com.sharma.vishal.knowYourTeam10.models.AppUser;
import com.sharma.vishal.knowYourTeam10.repositories.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AppUserService {

    private AppUserRepository repository;
    private AppUserMapper mapper;

    @Autowired
    public AppUserService(AppUserRepository repository,
                          AppUserMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public Optional<AppUserDto> getUserDetails(String userId) {
        return repository.findById(userId).map(mapper::toDto);
    }

    public AppUser saveUserDetails(AppUserDto appUserDto) {
        return repository.insert(mapper.toDocument(appUserDto));
    }
}
