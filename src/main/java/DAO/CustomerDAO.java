/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Customer;
import model.response.BookingResponse;

/**
 *
 * @author TRUONG DEP ZAI
 */
public class CustomerDAO extends DAO {

    public CustomerDAO() {
        super();
    }

    public ArrayList<Customer> searchCustomer(String key) {
        ArrayList<Customer> result = new ArrayList<Customer>();
        String sql = "SELECT * FROM tblCustomer WHERE name LIKE ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "%" + key + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Customer customer = new Customer();
                customer.setId(rs.getInt("id"));
                customer.setName(rs.getString("name"));
                customer.setPhone(rs.getString("phone"));
                result.add(customer);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public ArrayList<BookingResponse> searchBookingForms(Customer customer) {
        ArrayList<BookingResponse> result = new ArrayList<BookingResponse>();
        String sql = "SELECT \n"
                + "    bf.id AS bookingFormId,\n"
                + "    bd.date AS bookingDate,\n"
                + "    bf.startTime,\n"
                + "    bf.endTime,\n"
                + "    tc.type AS courtType,\n"
                + "    tc.number AS courtNumber\n"
                + "FROM tblBookingForm bf\n"
                + "JOIN tblBookingDetail bd ON bf.id = bd.idBookingForm\n"
                + "JOIN tblTennisCourt tc ON bd.idTennisCourt = tc.id\n"
                + "WHERE bf.idCustomer = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, customer.getId()+"");
            System.out.println(ps);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                BookingResponse br = new BookingResponse();
                br.setId(rs.getInt("bookingFormId"));
                br.setDate(rs.getTimestamp("bookingDate"));
                br.setStartTime(rs.getDate("startTime"));
                br.setEndTime(rs.getDate("endTime"));
                br.setType(rs.getString("courtType"));
                br.setNumberCourt(rs.getInt("courtNumber"));
                result.add(br);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
