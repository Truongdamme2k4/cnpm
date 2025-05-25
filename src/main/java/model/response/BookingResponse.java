/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.response;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author TRUONG DEP ZAI
 */
public class BookingResponse implements Serializable{
    private int id;
    private Timestamp date;
    private Date startTime;
    private Date endTime;
    private String type;
    private int numberCourt;

    public BookingResponse() {
        super();
    }

    public BookingResponse(int id, Timestamp date, Date startTime, Date endTime, String type, int numberCourt) {
        super();
        this.id = id;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.type = type;
        this.numberCourt = numberCourt;
    }

    public int getId() {
        return id;
    }

    public Timestamp getDate() {
        return date;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public String getType() {
        return type;
    }

    public int getNumberCourt() {
        return numberCourt;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setNumberCourt(int numberCourt) {
        this.numberCourt = numberCourt;
    }

    @Override
    public String toString() {
        return "BookingResponse{" + "id=" + id + ", date=" + date + ", startTime=" + startTime + ", endTime=" + endTime + ", type=" + type + ", numberCourt=" + numberCourt + '}';
    }
    
    
    
}
