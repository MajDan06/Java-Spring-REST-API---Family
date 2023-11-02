package com.example.demo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;

@Data
@AllArgsConstructor
@ToString
public class Family {
    private final String uid;
    private String name;
    private List<Member> members;

    public Family(String uid, String name) {
        this.uid = uid;
        this.name = name;
    }

}
