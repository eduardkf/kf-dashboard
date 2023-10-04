package com.kattyfashion.dashboard.repository;

import com.kattyfashion.dashboard.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserDetailServiceRepository extends JpaRepository<User, String> {


    Optional<User> findUserByUsername(String username);
}
