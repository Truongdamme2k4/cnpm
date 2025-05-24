/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.awt.RenderingHints;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Customer;

/**
 *
 * @author TRUONG DEP ZAI
 */
public class CustomerDAO extends DAO{

    public CustomerDAO() {
        super();
    }
    
    
    public ArrayList<Customer> searchCustomer(String key){
      ArrayList<Customer> result = new ArrayList<Customer>();
      String sql = "SELECT * FROM tblCustomer WHERE name LIKE ?";
      try{
          PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1,"%" + key + "%");
          ResultSet rs = ps.executeQuery();
          while(rs.next()){
             Customer customer= new Customer();
             customer.setId(rs.getInt("id"));
             customer.setName(rs.getString("name"));
             customer.setPhone(rs.getString("phone"));
             result.add(customer);
          }
      }catch(Exception e){
          e.printStackTrace();
      }
      return result;
    }
}
