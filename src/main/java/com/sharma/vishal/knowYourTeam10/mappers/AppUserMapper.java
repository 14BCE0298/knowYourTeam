package com.sharma.vishal.knowYourTeam10.mappers;

import com.sharma.vishal.knowYourTeam10.dtos.AppUserDto;
import com.sharma.vishal.knowYourTeam10.models.AppUser;
import org.springframework.stereotype.Component;

@Component
public class AppUserMapper {

    public AppUserDto toDto(AppUser appUser) {
        AppUserDto appUserDto = new AppUserDto();
        appUserDto.setEmail(appUser.getEmail());
        appUserDto.setUserId(appUser.getUserId());
        appUserDto.setPassword(appUser.getPassword());

        return appUserDto;
    }

    public AppUser toDocument(AppUserDto appUserdto) {
        AppUser appUser = new AppUser();
        appUser.setEmail(appUserdto.getEmail());
        appUser.setUserId(appUserdto.getUserId());
        appUser.setPassword(appUserdto.getPassword());

        return appUser;
    }
}
