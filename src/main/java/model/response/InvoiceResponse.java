/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.response;

import java.sql.Timestamp;
import java.util.ArrayList;
import model.Product;

/**
 *
 * @author TRUONG DEP ZAI
 */
public class InvoiceResponse {
     private String customerName;
     private String customerPhone;
     private Float customerDebt;
     private int numberCourt;
     private Timestamp time;
     private Float deposit;
     private Float price;
     private Timestamp checkin;
     private Timestamp checkout;
     private ArrayList<Product> usedProduct;

    public InvoiceResponse() {
    }

    public InvoiceResponse(String customerName, String customerPhone, Float customerDebt, int numberCourt, Timestamp time, Float deposit, Float price, Timestamp checkin, Timestamp checkout, ArrayList<Product> usedProduct) {
        this.customerName = customerName;
        this.customerPhone = customerPhone;
        this.customerDebt = customerDebt;
        this.numberCourt = numberCourt;
        this.time = time;
        this.deposit = deposit;
        this.price = price;
        this.checkin = checkin;
        this.checkout = checkout;
        this.usedProduct = usedProduct;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public Float getCustomerDebt() {
        return customerDebt;
    }

    public int getNumberCourt() {
        return numberCourt;
    }

    public Timestamp getTime() {
        return time;
    }

    public Float getDeposit() {
        return deposit;
    }

    public Float getPrice() {
        return price;
    }

    public Timestamp getCheckin() {
        return checkin;
    }

    public Timestamp getCheckout() {
        return checkout;
    }

    public ArrayList<Product> getUsedProduct() {
        return usedProduct;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public void setCustomerDebt(Float customerDebt) {
        this.customerDebt = customerDebt;
    }

    public void setNumberCourt(int numberCourt) {
        this.numberCourt = numberCourt;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public void setDeposit(Float deposit) {
        this.deposit = deposit;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public void setCheckin(Timestamp checkin) {
        this.checkin = checkin;
    }

    public void setCheckout(Timestamp checkout) {
        this.checkout = checkout;
    }

    public void setUsedProduct(ArrayList<Product> usedProduct) {
        this.usedProduct = usedProduct;
    }

    @Override
    public String toString() {
        return "InvoiceResponse{" + "customerName=" + customerName + ", customerPhone=" + customerPhone + ", customerDebt=" + customerDebt + ", numberCourt=" + numberCourt + ", time=" + time + ", deposit=" + deposit + ", price=" + price + ", checkin=" + checkin + ", checkout=" + checkout + ", usedProduct=" + usedProduct + '}';
    }
     
}
