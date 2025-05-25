/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;

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
    private ArrayList<BookingForm> bookingForms;
    private ArrayList<Invoice> invoices;

    public User() {
        super();
    }

    public User(int id, String name, String username, String password, String role, Float salary, ArrayList<BookingForm> bookingForms, ArrayList<Invoice> invoices) {
        super();
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.role = role;
        this.salary = salary;
        this.bookingForms = bookingForms;
        this.invoices = invoices;
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

    public ArrayList<BookingForm> getBookingForms() {
        return bookingForms;
    }

    public ArrayList<Invoice> getInvoices() {
        return invoices;
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

    public void setBookingForms(ArrayList<BookingForm> bookingForms) {
        this.bookingForms = bookingForms;
    }

    public void setInvoices(ArrayList<Invoice> invoices) {
        this.invoices = invoices;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name + ", username=" + username + ", password=" + password + ", role=" + role + ", salary=" + salary + ", bookingForms=" + bookingForms + ", invoices=" + invoices + '}';
    }

    
    
}
