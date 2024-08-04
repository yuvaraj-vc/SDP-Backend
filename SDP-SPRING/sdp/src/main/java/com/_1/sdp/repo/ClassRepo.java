package com._1.sdp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com._1.sdp.model.Class;
import java.util.Optional;

public interface ClassRepo extends JpaRepository<Class, Long> {
    Optional<Class> findByCid(Long cid);
}
