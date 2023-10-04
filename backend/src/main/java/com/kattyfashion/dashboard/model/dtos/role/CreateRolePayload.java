package com.kattyfashion.dashboard.model.dtos.role;

import com.kattyfashion.dashboard.model.Role;
import com.kattyfashion.dashboard.model.RoleEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class CreateRolePayload {
    String name;
    RoleEnum role;

    public CreateRolePayload(Role role) {
        this.setName(role.getName());
        this.setRole(role.getRole());
    }
}
