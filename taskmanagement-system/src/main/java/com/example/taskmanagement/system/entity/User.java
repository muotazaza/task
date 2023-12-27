package com.example.taskmanagement.system.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String  name ;

    @Column(name = "password")
    private String password;

    @Column(name = "role")
    private RoleType Role ;

    public User() {


    }


    public User(String name, String password, RoleType role) {
        this.name = name;
        this.password = password;
        Role = role;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public RoleType getRole() {
        return Role;
    }

    public void setRole(RoleType role) {
        Role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", Role=" + Role +
                '}';
    }
}
