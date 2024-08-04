package com._1.sdp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com._1.sdp.model.Sub;
import com._1.sdp.repo.SubRepo;

@Service
public class SubService {
    @Autowired
    private SubRepo srepo;
    

    public List<Sub> getSubs() {
        return srepo.findAll();
    }

    public Sub addSubs(Sub sub) {
        return srepo.save(sub);
    }

    public String deleteSub(Long sid) {
        srepo.deleteById(sid);
        return "Course Deleted " + sid;
    }

    public Optional<Sub> getSubBySid(Long sid) {
        return srepo.findById(sid);
    }

    public Sub updateSub(Long sid, Sub subDetails) {
        Sub sub = srepo.findById(sid).orElseThrow(() -> new RuntimeException("Sub not found with id " + sid));

        sub.setTitle(subDetails.getTitle());
        sub.setStaffs(subDetails.getStaffs());
        sub.setCredit(subDetails.getCredit());

        return srepo.save(sub);
    }
}
