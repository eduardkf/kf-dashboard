package com.kattyfashion.dashboard.service.role;

import com.kattyfashion.dashboard.errors.UserError;
import com.kattyfashion.dashboard.model.Role;
import com.kattyfashion.dashboard.model.RoleEnum;
import com.kattyfashion.dashboard.model.dtos.role.CreateRoleInput;
import com.kattyfashion.dashboard.repository.RoleRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.Optional;

@Service
@AllArgsConstructor
public class RoleServiceImpl implements IRoleService{
    @Autowired
    RoleRepository roleRepository;

    @Override
    public Optional<Role> getRoleByID(Long id) {
        return roleRepository.findById(id);
    }

    @Override
    public Optional<Role> getRoleByName(String name) {
        return roleRepository.findRolesByName(name);
    }

    @Override
    public Optional<Role> getRoleByType(RoleEnum roleEnum) {
        return roleRepository.findRolesByRole(roleEnum);
    }

    @Override
    public Optional<Role> createRole(CreateRoleInput createRoleInput) {
        if (getRoleByType(createRoleInput.getRole()) != null) {
            throw new UserError("Role already exists");
        }

        return Optional.of(roleRepository.save(createRoleInput.createRole(createRoleInput)));
    }
}
