package com.kattyfashion.dashboard.model.dtos.user;

import com.kattyfashion.dashboard.model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class SignUpUserInput {

    String username;
    String password;

    public User createUser() {
        User newUser = new User();
        newUser.setUsername(this.getUsername());
        newUser.setPassword(this.getPassword());
        return newUser;
    }
}
