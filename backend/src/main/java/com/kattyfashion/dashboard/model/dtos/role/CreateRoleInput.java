package com.kattyfashion.dashboard.model.dtos.role;

import com.kattyfashion.dashboard.model.Role;
import com.kattyfashion.dashboard.model.RoleEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateRoleInput {

    RoleEnum role;
    String name;

    public Role createRole (CreateRoleInput createRoleInput) {
        Role role = new Role();
        role.setName(createRoleInput.getName());
        role.setRole(createRoleInput.getRole());

        return role;
    }
}
