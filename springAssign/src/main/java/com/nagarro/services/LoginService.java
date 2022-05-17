package com.nagarro.services;

import com.nagarro.model.User;
import com.nagarro.repositories.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private LoginRepository loginRepository;

    public User login(String username, String password) {
        User user = loginRepository.findByUsernameAndPassword(username, password);
        return user;
    }
}
