package com.kattyfashion.dashboard.controller;

import com.kattyfashion.dashboard.model.Role;
import com.kattyfashion.dashboard.model.dtos.role.CreateRoleInput;
import com.kattyfashion.dashboard.model.dtos.role.CreateRolePayload;
import com.kattyfashion.dashboard.model.dtos.role.RoleDTO;
import com.kattyfashion.dashboard.service.role.RoleServiceImpl;
import com.kattyfashion.dashboard.service.user.UserServiceImpl;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Mono;

@Controller
public class RoleController {

    private final RoleServiceImpl roleService;

    public RoleController(RoleServiceImpl roleService) {
        this.roleService = roleService;
    }

    @MutationMapping
    Mono<CreateRolePayload> createRole(@Argument CreateRoleInput createRoleInput) {
        return Mono.just(new CreateRolePayload(roleService.createRole(createRoleInput).get()));
    }



}
