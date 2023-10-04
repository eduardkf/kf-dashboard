package com.kattyfashion.dashboard.errors;

public class UserError extends RuntimeException{

    public UserError(String message) {
        super(message);
    }
}
