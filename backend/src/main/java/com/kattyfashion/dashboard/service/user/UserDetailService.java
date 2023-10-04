package com.kattyfashion.dashboard.service.user;

import com.kattyfashion.dashboard.model.User;
import com.kattyfashion.dashboard.repository.UserDetailServiceRepository;
import com.kattyfashion.dashboard.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.ReactiveUserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class UserDetailService implements UserDetailsService {

    @Autowired
   PasswordEncoder passwordEncoder;
    @Autowired
    UserDetailServiceRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserDetails newDetails= userRepository.findUserByUsername(username).map(user ->
                org.springframework.security.core.userdetails.User.builder()
                        .username(user.getUsername())
                        .password(user.getPassword())
                        .roles("USER")
                        .build()).orElseThrow(() -> new UsernameNotFoundException("User not found!"));

        return newDetails;
    }
}
