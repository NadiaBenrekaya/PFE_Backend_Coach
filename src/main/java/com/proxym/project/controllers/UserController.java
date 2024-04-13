package com.proxym.project.controllers;

import com.proxym.project.entities.User;
import com.proxym.project.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/users")
//@PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_COACH', 'ROLE_TRAINEE')")

public class UserController {

  private  UserService userService;



  @PostMapping("/adduser")
    public User saveUser(
            @RequestBody User user)
    {

        return userService.saveUser(user);

    }

    // Read operation
    @PreAuthorize("hasAuthority('user:getall')")
    @GetMapping("/getall")
    public List<User> fetchUserList()
    {

        return  userService.fetchUserList();
    }

    // Update operation
    @PutMapping("/{id}")
    public User
    updateUser(@RequestBody User user, @PathVariable("id") Integer userId)
    {
        return userService.updateUser(user,userId);
    }

    // Delete operation
    @DeleteMapping("/{id}")
    public String deleteUserById(@PathVariable("id") Integer userId)
    {

        userService.deleteUserById(userId);
        return "Deleted Successfully";
    }



}
