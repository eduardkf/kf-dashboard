package com.kattyfashion.dashboard.model.dtos.user;

import com.kattyfashion.dashboard.model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
public class CreateUserPayload {

    String payload;
    User user;
    public CreateUserPayload(User user) {
        this.payload = "S-a incercat";
        this.user = user;
    }




}
