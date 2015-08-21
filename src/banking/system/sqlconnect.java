/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking.system;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Crusadersplanet
 */
public class sqlconnect {

    static Connection con;

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");

        } catch (ClassNotFoundException classnotfound) {
            JOptionPane.showMessageDialog(BankingSystem.view.firstview, "JDBC drivers not found", "Error", JOptionPane.ERROR_MESSAGE);

        }

    }

    public static Connection getConnection() {
        try {
            String url = "jdbc:mysql://localhost:3306/banking";
            con = DriverManager.getConnection(url, "root", "");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(BankingSystem.view.firstview, "Cannot get Connection", "Error", JOptionPane.ERROR_MESSAGE);

        }
        return con;

    }

    public static void closeConnection() {
        try {
            con.close();

        } catch (SQLException e1) {
            JOptionPane.showMessageDialog(BankingSystem.view.firstview, "Cannot Close Connection", "Error", JOptionPane.ERROR_MESSAGE);

        }

    }
}
