package com._1.sdp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Class {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cid;
    private String dept;
    private String section;   
    private String tutor;
   
    public Long getcid() {
        return cid;
    }
    public void setcid(Long cid) {
        this.cid = cid;
    }
    public String getdept() {
        return dept;
    }
    public void setdept(String dept) {
        this.dept = dept;
    }
    public String getsection() {
        return section;
    }
    public void setsection(String section) {
        this.section = section;
    }
   
    public String gettutor() {
        return tutor;
    }
    public void settutor(String tutor) {
        this.tutor = tutor;
    }
    
}
