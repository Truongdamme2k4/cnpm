/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 *
 * @author TRUONG DEP ZAI
 */
public class Invoice implements Serializable{
    private int id;
    private Timestamp date;
    private Float total;
    private Float redundant;
    private int userId;
    private int bookingId;

    public Invoice() {
        super();
    }

    public Invoice(int id, Timestamp date, Float total, Float redundant, int userId, int bookingId) {
        this.id = id;
        this.date = date;
        this.total = total;
        this.redundant = redundant;
        this.userId = userId;
        this.bookingId = bookingId;
    }

    public int getId() {
        return id;
    }

    public Timestamp getDate() {
        return date;
    }

    public Float getTotal() {
        return total;
    }

    public Float getRedundant() {
        return redundant;
    }

    public int getUserId() {
        return userId;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public void setRedundant(Float redundant) {
        this.redundant = redundant;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }
    
    
}
