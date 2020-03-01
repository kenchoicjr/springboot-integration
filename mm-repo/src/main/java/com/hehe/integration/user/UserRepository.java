package com.hehe.integration.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User,String> {

    @Query(value = "SELECT * FROM customerservice_user", nativeQuery = true)
    List<User> all();
}