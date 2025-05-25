/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author TRUONG DEP ZAI
 */
public class BookingForm implements Serializable{
    private int id;
    private Date date;
    private Date startTime;
    private Date endTime;
    private Float saleOff;
    private Customer customer;
    private User user;
    private ArrayList<BookingDetail> bookingDetails;
    private ArrayList<Invoice> invoices;

    public BookingForm() {
        super();
    }

    public BookingForm(int id, Date date, Date startTime, Date endTime, Float saleOff, Customer customer, User user, ArrayList<BookingDetail> bookingDetails, ArrayList<Invoice> invoices) {
        super();
        this.id = id;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.saleOff = saleOff;
        this.customer = customer;
        this.user = user;
        this.bookingDetails = bookingDetails;
        this.invoices = invoices;
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public Float getSaleOff() {
        return saleOff;
    }

    public Customer getCustomer() {
        return customer;
    }

    public User getUser() {
        return user;
    }

    public ArrayList<BookingDetail> getBookingDetails() {
        return bookingDetails;
    }

    public ArrayList<Invoice> getInvoices() {
        return invoices;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void setSaleOff(Float saleOff) {
        this.saleOff = saleOff;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setBookingDetails(ArrayList<BookingDetail> bookingDetails) {
        this.bookingDetails = bookingDetails;
    }

    public void setInvoices(ArrayList<Invoice> invoices) {
        this.invoices = invoices;
    }

    @Override
    public String toString() {
        return "BookingForm{" + "id=" + id + ", date=" + date + ", startTime=" + startTime + ", endTime=" + endTime + ", saleOff=" + saleOff + ", customer=" + customer + ", user=" + user + ", bookingDetails=" + bookingDetails + ", invoices=" + invoices + '}';
    }
    
    
}
