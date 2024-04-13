package com.proxym.project.services;

import com.proxym.project.entities.User;
import com.proxym.project.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;



    public User saveUser(User user) {
        return userRepository.save(user);
    }
    public List<User> fetchUserList() {
        System.out.println("get all service");
        return userRepository.findAll();
    }

    public void deleteUserById(Integer userId) {
        userRepository.deleteById(userId);
    }
    public User updateUser(User user, Integer userId) {
        User existingUser = userRepository.findById(userId).orElseThrow();

        if (Objects.nonNull(user.getFirstname()) && !"".equalsIgnoreCase(user.getFirstname())) {
            existingUser.setFirstname(user.getFirstname());
        }

        if (Objects.nonNull(user.getLastname()) && !"".equalsIgnoreCase(user.getLastname())) {
            existingUser.setLastname(user.getLastname());
        }

        if (Objects.nonNull(user.getEmail()) && !"".equalsIgnoreCase(user.getEmail())) {
            existingUser.setEmail(user.getEmail());
        }

        if (Objects.nonNull(user.getRole()) && !"".equalsIgnoreCase(String.valueOf(user.getRole()))) {
            existingUser.setRole(user.getRole());
        }

        return userRepository.save(existingUser);
    }


}
