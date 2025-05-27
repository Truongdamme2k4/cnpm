/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import static DAO.DAO.con;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.ArrayList;
import model.Customer;
import model.Invoice;
import model.Product;
import model.response.InvoiceResponse;

/**
 *
 * @author TRUONG DEP ZAI
 */
public class InvoiceDAO extends DAO {

    public InvoiceDAO() {
        super();
    }

    public InvoiceResponse getInvoice(int idBooking) {
        InvoiceResponse invoiceResponse = new InvoiceResponse();
        String sql1 = "SELECT \n"
                + "    c.name AS CustomerName,\n"
                + "    c.phone AS CustomerPhone,\n"
                + "    c.debt as CustomerDebt,\n"
                + "    tc.number AS NumberCourt,\n"
                + "    cs.price AS price,\n"
                + "    bd.date AS Time,\n"
                + "    cs.checkin AS Checkin,\n"
                + "    cs.checkout AS Checkout\n"
                + "FROM \n"
                + "    tblBookingForm bf\n"
                + "    INNER JOIN tblCustomer c ON bf.idCustomer = c.id\n"
                + "    INNER JOIN tblBookingDetail bd ON bf.id = bd.idBookingForm\n"
                + "    INNER JOIN tblTennisCourt tc ON bd.idTennisCourt = tc.id\n"
                + "    INNER JOIN tblCourtSession cs ON bd.id = cs.idBookingDetail\n"
                + "WHERE \n"
                + "    bf.id = ? ";

        try {
            PreparedStatement ps1 = con.prepareStatement(sql1);
            ps1.setString(1, idBooking + "");
            ResultSet rs1 = ps1.executeQuery();
            while (rs1.next()) {
                invoiceResponse.setCustomerName(rs1.getString("CustomerName"));
                invoiceResponse.setCustomerPhone(rs1.getString("CustomerPhone"));
                invoiceResponse.setCustomerDebt(rs1.getFloat("CustomerDebt"));
                invoiceResponse.setNumberCourt(rs1.getInt("NumberCourt"));
                invoiceResponse.setPrice(rs1.getFloat("price"));
                invoiceResponse.setDeposit(invoiceResponse.getPrice() / 10);
                invoiceResponse.setTime(rs1.getTimestamp("Time"));
                invoiceResponse.setCheckin(rs1.getTimestamp("Checkin"));
                invoiceResponse.setCheckout(rs1.getTimestamp("Checkout"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        String sql2 = "SELECT \n"
                + "    p.name AS ProductName,\n"
                + "    up.count AS ProductCount,\n"
                + "    p.price AS PricePerProduct\n"
                + "FROM \n"
                + "    tblBookingForm bf\n"
                + "    INNER JOIN tblBookingDetail bd ON bf.id = bd.idBookingForm\n"
                + "    INNER JOIN tblCourtSession cs ON bd.id = cs.idBookingDetail\n"
                + "    INNER JOIN tblUsedProduct up ON cs.id = up.idCourtSession\n"
                + "    INNER JOIN tblProduct p ON up.idProduct = p.id\n"
                + "WHERE \n"
                + "    bf.id = ?";
        try {
            PreparedStatement ps2 = con.prepareStatement(sql2);
            ps2.setString(1, idBooking + "");
            ResultSet rs2 = ps2.executeQuery();
            ArrayList<Product> products = new ArrayList<Product>();
            while (rs2.next()) {
                Product p = new Product(rs2.getString("ProductName"), rs2.getInt("ProductCount"), rs2.getFloat("PricePerProduct"));
                products.add(p);
            }
            invoiceResponse.setUsedProduct(products);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return invoiceResponse;
    }

    public Invoice saveInvoice(Invoice invoice) {
        String sql1 = "INSERT INTO tblInvoice (date, total, note, idUser, idBookingForm) VALUES (?, ?, ?, ?, ?)";
        String sql2 = "UPDATE tblBookingDetail SET status = 1 WHERE idBookingForm = ?";
        String sql3 = "UPDATE tblCustomer c JOIN tblBookingForm bf ON c.id = bf.idCustomer SET c.debt = ? WHERE bf.id = ?";

        try {
            PreparedStatement ps1 = con.prepareStatement(sql1);
            Timestamp now = Timestamp.from(Instant.now());
            ps1.setString(1, now+""); 
            ps1.setFloat(2, invoice.getTotal());
            ps1.setString(3, ""); 
            ps1.setInt(4, invoice.getUserId());
            ps1.setInt(5, invoice.getBookingId());
            ps1.executeUpdate(); 

            PreparedStatement ps2 = con.prepareStatement(sql2);
            ps2.setInt(1, invoice.getBookingId()); 
            ps2.executeUpdate(); 

            PreparedStatement ps3 = con.prepareStatement(sql3);
            ps3.setFloat(1, invoice.getRedundant()); 
            ps3.setInt(2, invoice.getBookingId());
            ps3.executeUpdate(); 

          

        } catch (Exception e) {
            e.printStackTrace();
            return null; // Trả về null nếu có lỗi
        }
        return invoice;
    }

}
