/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import DAO.CustomerDAO;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Customer;
import model.User;
import model.response.BookingResponse;

/**
 *
 * @author TRUONG DEP ZAI
 */
public class BookingListFrm extends javax.swing.JFrame {
    private User user;
    private Customer customer;
    private ArrayList<BookingResponse> listBookings;
    /**
     * Creates new form BookingListFrm
     */
    public BookingListFrm(User user, Customer customer) {
        initComponents();
        setLocationRelativeTo(null);
        this.user = user;
        this.customer = customer;
        jLabel1.setText(customer.getName());
        CustomerDAO cd = new CustomerDAO();
        listBookings = cd.searchBookingForms(customer);

        String[] columnNames = {"No.", "Date", "Start Time", "End Time", "Type", "Court"};
        String[][] value = new String[listBookings.size()][6];
        for (int i = 0; i < listBookings.size(); i++) {
            value[i][0] = listBookings.get(i).getId() + "";
            value[i][1] = listBookings.get(i).getDate()+"";
            value[i][2] = listBookings.get(i).getStartTime()+"";
            if(listBookings.get(i).getStartTime() == null) value[i][2]="";
            value[i][3] = listBookings.get(i).getEndTime()+"";
            if(listBookings.get(i).getEndTime() == null) value[i][3]="";
            value[i][4] = listBookings.get(i).getType()+"";
            value[i][5] = listBookings.get(i).getNumberCourt()+"";
        }
        DefaultTableModel tableModel = new DefaultTableModel(value, columnNames) {
            @Override
            public boolean isCellEditable(int row, int column) {
                //unable to edit cells
                return false;
            }
        };
        jTable1.setModel(tableModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CustomerName");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Booking List");

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Date", "Start Time ", "End Time", "Type", "Court"
            }
        ));
        jTable1.setEnabled(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setMinWidth(200);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(200);
        }

        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(207, 207, 207)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int column = jTable1.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY() / jTable1.getRowHeight();

        if (row < jTable1.getRowCount() && row >= 0 && column < jTable1.getColumnCount() && column >= 0) {
            (new InvoiceFrm(user, listBookings.get(row).getId())).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        (new ReceptionistHomeFrm(this.user)).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
