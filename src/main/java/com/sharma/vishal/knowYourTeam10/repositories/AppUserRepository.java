package com.sharma.vishal.knowYourTeam10.repositories;

import com.sharma.vishal.knowYourTeam10.models.AppUser;
import org.springframework.stereotype.Repository;

@Repository
public class AppUserRepository {

    public AppUser searchUserById(String userId) {
        AppUser appUser = new AppUser();
        appUser.setUserId(userId);
        appUser.setUsername("harry potter");
        appUser.setEmail("harryTheSeeker@gryffindor.com");

        return appUser;
    }
}
