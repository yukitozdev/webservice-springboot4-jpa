package com.yukitoz.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yukitoz.webservice.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

    

}
