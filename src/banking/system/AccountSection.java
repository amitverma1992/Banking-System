/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking.system;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Crusadersplanet
 */
public class AccountSection extends javax.swing.JPanel {

    static Banking_First_View bankview = BankingSystem.view;

    checkBalanceView cbv;
    NewAccount na;
    Deposit depositamount;
    JButton btn;
    JLabel lbl;
    AccountToAccount aa;
    DeleteAccount da;
    Accountdetail detail;

    /**
     * Creates new form AccountSection
     */
    public AccountSection() {
        initComponents();
        cbv = new checkBalanceView();
        na = new NewAccount();
        depositamount = new Deposit();
        aa = new AccountToAccount();
        da = new DeleteAccount();
        detail = new Accountdetail();

        enableVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        newAccount = new javax.swing.JButton();
        deleteAccount = new javax.swing.JButton();
        checkBalance = new javax.swing.JButton();
        transferAccount = new javax.swing.JButton();
        depositAccount = new javax.swing.JButton();
        withdrawlAccount = new javax.swing.JButton();
        detailAccount = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createTitledBorder(null, "Account", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 14), new java.awt.Color(51, 51, 51)))); // NOI18N
        setMaximumSize(new java.awt.Dimension(200, 500));
        setMinimumSize(new java.awt.Dimension(200, 500));
        setPreferredSize(new java.awt.Dimension(200, 500));

        newAccount.setText("New Account");
        newAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newAccountActionPerformed(evt);
            }
        });

        deleteAccount.setText("Delete Account");
        deleteAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAccountActionPerformed(evt);
            }
        });

        checkBalance.setText("Check Balance");
        checkBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBalanceActionPerformed(evt);
            }
        });

        transferAccount.setText("<html> <center><label>Transfer</label></center>\n<label> (Account -  Account) </label>");
        transferAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferAccountActionPerformed(evt);
            }
        });

        depositAccount.setText("Deposit");
        depositAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositAccountActionPerformed(evt);
            }
        });

        withdrawlAccount.setText("Withdrawl");
        withdrawlAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawlAccountActionPerformed(evt);
            }
        });

        detailAccount.setText("Account Details");
        detailAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailAccountActionPerformed(evt);
            }
        });

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(deleteAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(transferAccount)
                        .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                        .addComponent(withdrawlAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(depositAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(detailAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(checkBalance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(newAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {deleteAccount, exit, transferAccount});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(newAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkBalance)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(detailAccount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(depositAccount)
                .addGap(11, 11, 11)
                .addComponent(withdrawlAccount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(transferAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteAccount)
                .addGap(18, 18, 18)
                .addComponent(exit)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {checkBalance, deleteAccount, depositAccount, detailAccount, exit, newAccount, transferAccount, withdrawlAccount});

    }// </editor-fold>//GEN-END:initComponents

    private void checkBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBalanceActionPerformed

        enableVisible(false);
        bankview.firstview.add(cbv, BorderLayout.CENTER);
        cbv.setVisible(true);


    }//GEN-LAST:event_checkBalanceActionPerformed

    private void newAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newAccountActionPerformed

        enableVisible(false);
        bankview.firstview.add(na, BorderLayout.CENTER);
        na.setVisible(true);
    }//GEN-LAST:event_newAccountActionPerformed

    private void depositAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositAccountActionPerformed
        enableVisible(false);
        btn = Deposit.getbutton();
        btn.setActionCommand("deposit");
        btn.setText("Deposit");
        lbl = Deposit.getLabel();
        lbl.setText("Deposit To Account");

        bankview.firstview.add(depositamount, BorderLayout.CENTER);
        depositamount.setVisible(true);

    }//GEN-LAST:event_depositAccountActionPerformed

    private void withdrawlAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawlAccountActionPerformed
        enableVisible(false);
        btn = Deposit.getbutton();
        btn.setActionCommand("withdrawl");
        btn.setText("Withdrawl");
        lbl = Deposit.getLabel();
        lbl.setText("Withdrawl From Account");

        bankview.firstview.add(depositamount, BorderLayout.CENTER);
        depositamount.setVisible(true);
    }//GEN-LAST:event_withdrawlAccountActionPerformed

    private void transferAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferAccountActionPerformed
        enableVisible(false);
        bankview.firstview.add(aa, BorderLayout.CENTER);
        aa.setVisible(true);
    }//GEN-LAST:event_transferAccountActionPerformed

    private void deleteAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAccountActionPerformed

        enableVisible(false);
        bankview.firstview.add(da, BorderLayout.CENTER);
        da.setVisible(true);
    }//GEN-LAST:event_deleteAccountActionPerformed

    private void detailAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailAccountActionPerformed
        enableVisible(false);
        bankview.firstview.add(detail, BorderLayout.CENTER);
        detail.setVisible(true);
    }//GEN-LAST:event_detailAccountActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
       int x=JOptionPane.showConfirmDialog(BankingSystem.view.firstview,"Confirm Exit", "Exit", JOptionPane.YES_NO_OPTION);
                if (x==0){
                    BankingSystem.view.firstview.dispose();
               }
    }//GEN-LAST:event_exitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkBalance;
    private javax.swing.JButton deleteAccount;
    private javax.swing.JButton depositAccount;
    private javax.swing.JButton detailAccount;
    private javax.swing.JButton exit;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JButton newAccount;
    private javax.swing.JButton transferAccount;
    private javax.swing.JButton withdrawlAccount;
    // End of variables declaration//GEN-END:variables

    private void enableButtons(boolean b) {
        
        checkBalance.setEnabled(b);
        deleteAccount.setEnabled(b);
        depositAccount.setEnabled(b);
        detailAccount.setEnabled(b);
        exit.setEnabled(b);
        newAccount.setEnabled(b);
        transferAccount.setEnabled(b);
        withdrawlAccount.setEnabled(b);

    }

    private void enableVisible(boolean b) {

        cbv.setVisible(b);
        na.setVisible(b);
        depositamount.setVisible(b);
        aa.setVisible(b);
        da.setVisible(b);
        detail.setVisible(b);

    }
}
