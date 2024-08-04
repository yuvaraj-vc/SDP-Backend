package com._1.sdp.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com._1.sdp.model.Users;

import com._1.sdp.repo.UserRepo;

@Service
public class UserService {
    @Autowired
    private UserRepo urepo;
    

    public List<Users> getUsers() {
        return urepo.findAll();
    }

    public Users addUsers(Users user) {
        return urepo.save(user);
    }

    public String deleteUser(Long uid) {
        urepo.deleteById(uid);
        return "User Deleted " + uid;
    }

    public Users findUserByUid(Long uid) {
        return urepo.findById(uid).orElse(null);
    }

    public Users editUserByUid(Long uid, Users userDetails) {
        Users user = urepo.findByUid(uid);
        if (user != null) {
            user.setName(userDetails.getName());
            user.setEmail(userDetails.getEmail());
            return urepo.save(user);
        }
        return null;
    }


}
