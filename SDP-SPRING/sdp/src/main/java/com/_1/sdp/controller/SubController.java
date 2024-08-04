package com._1.sdp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com._1.sdp.model.Sub;
import com._1.sdp.service.SubService;

@RestController
@RequestMapping("/subs")
public class SubController {
    @Autowired
    private SubService sservice;

    @GetMapping("/getsubs")
    public List<Sub> GetSubs() {
        return sservice.getSubs();
    }

    @PostMapping("/add")
    public Sub AddSubes(@RequestBody Sub sub) {
        return sservice.addSubs(sub);
    }

    @DeleteMapping("/delete/{sid}")
    public String DeleteSub(@PathVariable Long sid) {
        return sservice.deleteSub(sid);
    }

    @GetMapping("/find/{sid}")
    public Optional<Sub> getSubBySid(@PathVariable Long sid) {
        return sservice.getSubBySid(sid);
    }

    @PutMapping("/update/{sid}")
    public Sub updateSub(@PathVariable Long sid, @RequestBody Sub subDetails) {
        return sservice.updateSub(sid, subDetails);
    }
}
