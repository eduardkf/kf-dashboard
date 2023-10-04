package com.kattyfashion.dashboard.repository;

import com.kattyfashion.dashboard.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
//TODO: CHANGE TO MONO INSTEAD OF OPTIONAL
    Optional<User> findUserById(Long id);

    Optional<User> findUserByUsername(String username);
}
