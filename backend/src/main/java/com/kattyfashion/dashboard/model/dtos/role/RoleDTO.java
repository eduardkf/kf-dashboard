package com.kattyfashion.dashboard.model.dtos.role;

import com.kattyfashion.dashboard.model.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@AllArgsConstructor
@Getter
@Setter
public class RoleDTO {

    Set<Role> roles;

    public RoleDTO(Role role) {

    }
}
