package com.culturacarabobo.cultorregistration.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.culturacarabobo.cultorregistration.backend.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

    public User findByUsername(String username);

}
