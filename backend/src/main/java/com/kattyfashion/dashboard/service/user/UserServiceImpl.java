package com.kattyfashion.dashboard.service.user;

import com.kattyfashion.dashboard.errors.UserError;
import com.kattyfashion.dashboard.model.Role;
import com.kattyfashion.dashboard.model.User;
import com.kattyfashion.dashboard.model.dtos.user.CreateUserInput;
import com.kattyfashion.dashboard.model.dtos.user.SignUpUserInput;
import com.kattyfashion.dashboard.model.dtos.user.UpdateUserInput;
import com.kattyfashion.dashboard.repository.RoleRepository;
import com.kattyfashion.dashboard.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserServiceImpl implements IUserService{
    @Autowired
    UserRepository userRepository;
    @Autowired
    RoleRepository roleRepository;
    @Override
    public Optional<User> getById(Long id) {
       return userRepository.findUserById(id);
    }

    @Override
    public Optional<User> createUser(CreateUserInput createUserInput) {
        return Optional.of(userRepository.save(createUserInput.createUser()));
    }

    @Override
    public Optional<User> signUpUser(SignUpUserInput signUpUserInput) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        signUpUserInput.setPassword(encoder.encode(signUpUserInput.getPassword()));
        return Optional.of(userRepository.save(signUpUserInput.createUser()));
    }

    @Override
    public Optional<User> getUserByUsername(String username) {
        return userRepository.findUserByUsername(username);
    }


    @Override
    public Optional<User> updateUser(UpdateUserInput updateUserInput) {
        User userToUpdate = getUserByUsername(updateUserInput.getUsername()).get();
        Set<Role> roleList=  updateUserInput.getRoles().stream().map(roleEnum -> roleRepository.findRolesByRole(roleEnum).get()).collect(Collectors.toSet());
        if(!roleList.isEmpty()) {
            userToUpdate.setRoles(roleList);
        }

        return Optional.of(userRepository.save(userToUpdate));
    }


}
