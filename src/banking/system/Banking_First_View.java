/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking.system;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import javax.imageio.ImageIO;

import javax.swing.*;

/**
 *
 * @author Crusadersplanet
 */
public class Banking_First_View {

    JFrame firstview;

    JLabel image;

    Banking_First_View() throws IOException {
        firstview = new JFrame("Banking System");
        firstview.setSize(1024, 768);
        firstview.setPreferredSize(new Dimension(1024, 700));
        firstview.setVisible(true);
        firstview.getContentPane().setBackground(Color.BLACK);
        firstview.getContentPane().setForeground(Color.WHITE);

        firstview.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        AccountLogin accountlogin = new AccountLogin();

        Image img1 = ImageIO.read(getClass().getResource("/banking/system/res/start.jpg")).getScaledInstance(600, 600, Image.SCALE_AREA_AVERAGING);

        ImageIcon img = new ImageIcon(img1);
        image = new JLabel("", img, JLabel.CENTER);

        firstview.add(image, BorderLayout.CENTER);
        firstview.add(accountlogin.loginCheckAccount, BorderLayout.SOUTH);

        firstview.pack();
        firstview.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                int x = JOptionPane.showConfirmDialog(BankingSystem.view.firstview, "Confirm Exit", "Exit", JOptionPane.YES_NO_OPTION);
                if (x == 0) {
                    firstview.dispose();
                } else {
                    firstview.setVisible(true);
                }

            }

        }
        );

    }

}
