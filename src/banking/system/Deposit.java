/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking.system;

import java.awt.Component;
import java.sql.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Amit's
 */
public class Deposit extends javax.swing.JPanel {

    Connection con;
    int depBalance, accNo;
    static String type;

    /**
     * Creates new form Deposit
     */
    public Deposit() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headingLabel = new javax.swing.JLabel();
        depositAccountNoLabel = new javax.swing.JLabel();
        depositAmountLabel = new javax.swing.JLabel();
        depositAccountNo = new javax.swing.JTextField();
        depositAmount = new javax.swing.JTextField();
        deposit = new javax.swing.JButton();
        clear = new javax.swing.JButton();

        headingLabel.setBackground(new java.awt.Color(0, 0, 0));
        headingLabel.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        headingLabel.setForeground(new java.awt.Color(255, 255, 255));
        headingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headingLabel.setText("Deposit To Account");
        headingLabel.setOpaque(true);

        depositAccountNoLabel.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        depositAccountNoLabel.setLabelFor(depositAccountNo);
        depositAccountNoLabel.setText(" Account No.:");

        depositAmountLabel.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        depositAmountLabel.setLabelFor(depositAmount);
        depositAmountLabel.setText("Enter Amount:");

        deposit.setText("Deposit");
        deposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositActionPerformed(evt);
            }
        });

        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headingLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(depositAccountNoLabel)
                            .addComponent(depositAmountLabel))
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(depositAccountNo)
                            .addComponent(depositAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(deposit)
                        .addGap(71, 71, 71)
                        .addComponent(clear)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {depositAccountNoLabel, depositAmountLabel});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(depositAccountNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(depositAccountNoLabel))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(depositAmountLabel)
                    .addComponent(depositAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deposit)
                    .addComponent(clear))
                .addGap(0, 85, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void depositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositActionPerformed

        if (!depositAccountNo.getText().isEmpty() && !depositAmount.getText().isEmpty()) {
            String dno = depositAccountNo.getText().trim();
            String dpa = depositAmount.getText().trim();
            accNo = Integer.parseInt(dno);
            depBalance = Integer.parseInt(dpa);
            try {
                con = sqlconnect.getConnection();
                if (con != null) {
                    String sql1 = "SELECT balancedb from bank_balance WHERE accountno=?";
                    PreparedStatement ps = con.prepareStatement(sql1);
                    ps.setInt(1, accNo);
                    ResultSet rs = ps.executeQuery();
                    if (rs.last()) {

                        int balance = rs.getInt("balancedb");
                        int newbalance = getNewBalance(balance);
                        String transtype = type + depositAmount.getText();
                        String sql2 = "UPDATE bank_balance SET balancedb=?, transactiontype=? WHERE accountno=?";
                        PreparedStatement ps1 = con.prepareStatement(sql2);
                        ps1.setInt(1, newbalance);
                        ps1.setString(2, transtype);
                        ps1.setInt(3, accNo);
                        int result = ps1.executeUpdate();
                        if (result != -1) {
                            JOptionPane.showMessageDialog(BankingSystem.view.firstview, "Transaction of INR " + depositAmount.getText() + " in Account " + depositAccountNo.getText() + " is sucessful.", "Transaction Succesful", JOptionPane.INFORMATION_MESSAGE);
                            depositAccountNo.setText(" ");
                            depositAmount.setText(" ");

                        }
                    } else {
                        JOptionPane.showMessageDialog(BankingSystem.view.firstview, "Account No. does Not exist", "Account Not Exist", JOptionPane.ERROR_MESSAGE);
                    }

                } else {
                    JOptionPane.showMessageDialog(BankingSystem.view.firstview, "Could not get Database Connection", "Connection Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException e) {

                JOptionPane.showMessageDialog(BankingSystem.view.firstview, "Something wrong with databases", "Database Error", JOptionPane.ERROR_MESSAGE);
            } finally {
                sqlconnect.closeConnection();

            }

        } else {

            JOptionPane.showMessageDialog(BankingSystem.view.firstview, "Please fill in all Fields", "Field Empty", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_depositActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        depositAccountNo.setText(" ");
        depositAmount.setText(" ");
    }//GEN-LAST:event_clearActionPerformed

    public static JButton getbutton() {
        return deposit;

    }

    public static JLabel getLabel() {
        return headingLabel;

    }

    private int getNewBalance(int blnc) {
        if ("deposit".equals(deposit.getActionCommand())) {
            blnc = blnc + depBalance;
            type = "deposit";
        } else if ("withdrawl".equals(deposit.getActionCommand())) {
            blnc = blnc - depBalance;
            type = "withdrawl";
        }
        return blnc;

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    public static javax.swing.JButton deposit;
    private javax.swing.JTextField depositAccountNo;
    private javax.swing.JLabel depositAccountNoLabel;
    private javax.swing.JTextField depositAmount;
    private javax.swing.JLabel depositAmountLabel;
    private static javax.swing.JLabel headingLabel;
    // End of variables declaration//GEN-END:variables
}