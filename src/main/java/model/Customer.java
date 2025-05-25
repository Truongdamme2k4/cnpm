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
public class Customer implements Serializable{
    private int id;
    private String name;
    private String phone;
    private ArrayList<BookingForm> bookingForms;

    public Customer() {
        super();
    }

    public Customer(int id, String name, String phone, ArrayList<BookingForm> bookingForms) {
        super();
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.bookingForms = bookingForms;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public ArrayList<BookingForm> getBookingForms() {
        return bookingForms;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setBookingForms(ArrayList<BookingForm> bookingForms) {
        this.bookingForms = bookingForms;
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", name=" + name + ", phone=" + phone + ", bookingForms=" + bookingForms + '}';
    }
 
    
    
}
