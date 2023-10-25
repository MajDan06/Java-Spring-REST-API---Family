package com.example.demo;

import java.util.List;

public class Family {
    private final String uid;
    private String name;
    private List<Member> members;

    public Family(String uid, String name, List<Member> members) {
        this.uid = uid;
        this.name = name;
        this.members = members;
    }

    public String getUid() {
        return uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }
}
