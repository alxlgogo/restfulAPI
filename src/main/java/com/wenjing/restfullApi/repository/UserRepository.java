package com.wenjing.restfullApi.repository;


import com.wenjing.restfullApi.model.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public User findByUsername(String username) {
        String password = new BCryptPasswordEncoder().encode("user");
        return new User("001", "user", password, "083 024");
    }
}
