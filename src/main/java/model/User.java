/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author TRUONG DEP ZAI
 */
public class User implements Serializable {
    private int id;
    private String name;
    private String username;
    private String password;
    private String role;
    private Float salary;

    public User(int id, String name, String username, String password, String role, Float salary) {
        super();
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.role = role;
        this.salary=salary;
    }

    public User() {
        super();
    }

    public int getId() {
        return id;
    }
 
    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public Float getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }
    

    
    
    
}
