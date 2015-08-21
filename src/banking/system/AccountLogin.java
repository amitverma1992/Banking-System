/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking.system;

import java.awt.BorderLayout;

import java.awt.Dimension;

import java.awt.event.*;

import java.sql.*;

import javax.swing.*;

/**
 *
 * @author Crusadersplanet
 */
public class AccountLogin implements ActionListener {

    JTextField userAccount;
    JButton loginAccount;
    JPasswordField passwordAccount;
    JPanel loginCheckAccount;
    static Connection con1;
    ResultSet rs;
    Dimension d;

    JDialog dialog;

    public AccountLogin() {
        loginCheckAccount = new JPanel();
        d = new Dimension(350, 300);
        loginCheckAccount.setSize(d);
        loginCheckAccount.setPreferredSize(d);
        loginCheckAccount.setMaximumSize(d);

        loginCheckAccount.setVisible(true);
        loginCheckAccount.setBorder(BorderFactory.createTitledBorder("Account Login"));
        JLabel labelusername = new JLabel("Username: ");
        JLabel labelpass = new JLabel("Password: ");
        userAccount = new JTextField();
        passwordAccount = new JPasswordField();
        loginAccount = new JButton("Login");
        loginCheckAccount.setLayout(null);
        labelusername.setBounds(400, 50, 200, 30);
        labelpass.setBounds(400, 100, 200, 30);
        userAccount.setBounds(500, 50, 200, 30);
        passwordAccount.setBounds(500, 100, 200, 30);
        loginAccount.setBounds(525, 150, 75, 30);
        loginCheckAccount.add(labelusername);
        loginCheckAccount.add(userAccount);
        loginCheckAccount.add(labelpass);
        loginCheckAccount.add(passwordAccount);
        loginCheckAccount.add(loginAccount);

        

        loginAccount.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginAccount) {
            con1 = sqlconnect.getConnection();
            String user = userAccount.getText();

            String pass = passwordAccount.getText();

            String sqlstatement = "SELECT * FROM access WHERE username=? and password=?";
            if (con1 != null) {
                try {
                    PreparedStatement ps = con1.prepareStatement(sqlstatement);
                    ps.setString(1, user);
                    ps.setString(2, pass);
                    rs = ps.executeQuery();
                    if (rs.last()) {
                        String accessUser = rs.getString("role");

                        loginCheckAccount.setVisible(false);
                        BankingSystem.view.image.setVisible(false);

                        AccountSection acc = new AccountSection();

                        BankingSystem.view.firstview.add(acc, BorderLayout.WEST);

                        acc.setVisible(true);

                    } else {
                        JOptionPane.showMessageDialog(BankingSystem.view.firstview, "Please Enter Correct Username and Password", "Login Error", JOptionPane.ERROR_MESSAGE);

                        con1.close();

                    }

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(BankingSystem.view.firstview, "Connection cant get", "Error", JOptionPane.ERROR_MESSAGE);
                } finally {
                    sqlconnect.closeConnection();

                }

            }

        }

    }

}
