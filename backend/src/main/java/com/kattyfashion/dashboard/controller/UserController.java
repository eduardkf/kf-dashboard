package com.kattyfashion.dashboard.controller;

import com.kattyfashion.dashboard.model.User;
import com.kattyfashion.dashboard.model.dtos.user.SignUpUserInput;
import com.kattyfashion.dashboard.model.dtos.user.UpdateUserInput;
import com.kattyfashion.dashboard.model.dtos.user.CreateUserInput;
import com.kattyfashion.dashboard.model.dtos.user.CreateUserPayload;
import com.kattyfashion.dashboard.service.user.UserServiceImpl;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Mono;

@Controller
public class UserController {

    private final UserServiceImpl userService;
    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @QueryMapping
    User getUserById(@Argument Long id) {
    return userService.getById(id).get();
}

    @QueryMapping
    User getUserByUsername(@Argument String username) {
        return userService.getUserByUsername(username).get();
    }

    @MutationMapping
    Mono<CreateUserPayload> signUp(@Argument SignUpUserInput signUpUserInput) {
        if (userService.getUserByUsername(signUpUserInput.getUsername()) != null) {
            return Mono.justOrEmpty(new CreateUserPayload());
        }

        return Mono.justOrEmpty(new CreateUserPayload(userService.signUpUser(signUpUserInput).get()));
    }

    @MutationMapping
        Mono<CreateUserPayload> createUser(@Argument CreateUserInput createUserInput) {

            return Mono.justOrEmpty(new CreateUserPayload(userService.createUser(createUserInput).get()));
        }

        @MutationMapping
        Mono<CreateUserPayload> updateUser(@Argument UpdateUserInput updateUserInput) {
            return Mono.just(new CreateUserPayload(userService.updateUser(updateUserInput).get()));
        }
}
