package com._1.sdp.model;

import jakarta.persistence.*;

@Entity
public class Sub {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sid;
    private String title;
    private String staffs;   
    private String credit;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

    public Long getSid() {
        return sid;
    }
    public void setSid(Long sid) {
        this.sid = sid;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getStaffs() {
        return staffs;
    }
    public void setStaffs(String staffs) {
        this.staffs = staffs;
    }
    public String getCredit() {
        return credit;
    }
    public void setCredit(String credit) {
        this.credit = credit;
    }

    public Users getUser() {
        return user;
    }
    public void setUser(Users user) {
        this.user = user;
    }
}
