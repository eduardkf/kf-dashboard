package com.kattyfashion.dashboard.model.dtos.user;

import com.kattyfashion.dashboard.model.RoleEnum;
import com.kattyfashion.dashboard.model.User;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.EnumSet;

@Getter
@Setter
public class CreateUserInput {

    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private EnumSet<RoleEnum> roles;
    private LocalDateTime createdAt;
    public User createUser() {
        User user = new User();

        user.setFirstName(this.getFirstName());
        user.setLastName(this.getLastName());
        user.setUsername(this.getUsername());
        user.setPassword(this.getPassword());
        user.setCreatedAt(LocalDateTime.now());

        return user;
    }
}
