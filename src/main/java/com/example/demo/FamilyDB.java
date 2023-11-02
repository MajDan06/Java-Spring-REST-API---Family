package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "family")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FamilyDB {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "origin")
    private String origin;
    @OneToOne
    @JoinColumn(name = "head")
    private MembersDB head;
}
