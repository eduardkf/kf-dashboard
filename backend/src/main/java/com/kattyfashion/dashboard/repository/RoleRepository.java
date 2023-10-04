package com.kattyfashion.dashboard.repository;


import com.kattyfashion.dashboard.model.Role;
import com.kattyfashion.dashboard.model.RoleEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findRolesByRole(RoleEnum roleEnum);

    Optional<Role> findRolesByName(String name);

}
