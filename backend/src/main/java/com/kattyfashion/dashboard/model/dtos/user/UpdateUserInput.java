package com.kattyfashion.dashboard.model.dtos.user;

import com.kattyfashion.dashboard.model.RoleEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@AllArgsConstructor
@Setter
@Getter
public class UpdateUserInput {

    String username;
    Set<RoleEnum> roles;
}
