package com.kattyfashion.dashboard.service.role;

import com.kattyfashion.dashboard.model.Role;
import com.kattyfashion.dashboard.model.RoleEnum;
import com.kattyfashion.dashboard.model.dtos.role.CreateRoleInput;
import reactor.core.publisher.Mono;

import java.util.Optional;

public interface IRoleService {

    Optional<Role> getRoleByID(Long id);

    Optional<Role> getRoleByName(String Name);

    Optional<Role> getRoleByType(RoleEnum roleEnum);

    Optional<Role> createRole(CreateRoleInput createRoleInput);
}
