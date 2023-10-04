package com.kattyfashion.dashboard.service.user;

import com.kattyfashion.dashboard.model.User;
import com.kattyfashion.dashboard.model.dtos.user.CreateUserInput;
import com.kattyfashion.dashboard.model.dtos.user.SignUpUserInput;
import com.kattyfashion.dashboard.model.dtos.user.UpdateUserInput;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.Optional;

@Service
public interface IUserService  {

    Optional<User> getById(Long id);

    Optional<User> createUser(CreateUserInput createUserInput);

    Optional<User> signUpUser(SignUpUserInput signUpUserInput);

    Optional<User> getUserByUsername(String username);
    Optional<User> updateUser(UpdateUserInput updateUserInput);

}
