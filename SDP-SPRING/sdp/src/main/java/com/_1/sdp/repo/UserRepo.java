package com._1.sdp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com._1.sdp.model.Users;

public interface UserRepo extends JpaRepository<Users, Long> {
    Users findByUid(Long uid);
}
