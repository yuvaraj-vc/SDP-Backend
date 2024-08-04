package com._1.sdp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com._1.sdp.model.Users;
import com._1.sdp.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService uservice;

    @GetMapping("/getusers")
    public List<Users> GetUsers() {
        return uservice.getUsers();
    }

    @PostMapping("/register")
    public Users AddUsers(@RequestBody Users user) {
        return uservice.addUsers(user);
    }

    @DeleteMapping("/delete/{uid}")
    public String DeleteUser(@PathVariable Long uid) {
        return uservice.deleteUser(uid);
    }

    @GetMapping("/find/{uid}")
    public Users findUserByUid(@PathVariable Long uid) {
        return uservice.findUserByUid(uid);
    }

    @PutMapping("/edit/{uid}")
    public Users editUserByUid(@PathVariable Long uid, @RequestBody Users userDetails) {
        return uservice.editUserByUid(uid, userDetails);
    }
}
