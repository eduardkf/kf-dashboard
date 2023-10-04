package com.kattyfashion.dashboard.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import com.kattyfashion.dashboard.model.RoleEnum;
import java.util.Collection;

@Entity
@Table
@Setter
@Getter
public class Role {

    @Id
    @Column(name = "role_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.ORDINAL)
    private RoleEnum role;

    private String name;

    @ManyToMany(mappedBy = "roles")
    private Collection<User> users;
}
