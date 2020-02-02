package com.sharma.vishal.knowYourTeam10.repositories;

import com.sharma.vishal.knowYourTeam10.models.AppUser;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface AppUserRepository extends MongoRepository<AppUser, String> {

    @Override
    Optional<AppUser> findById(String s);

    @Override
    AppUser insert(AppUser appUser);
}
