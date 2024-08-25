package com.kingChudi.security.demo;

import com.kingChudi.security.model.User;
import com.kingChudi.security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Optional<User> getUserById(Integer id){
        return userRepository.findById(id);
    }
}
