/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package banking.system;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Crusadersplanet
 */
public class BankingSystem {
    static Banking_First_View view;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        setLookandFeel();
         view= new Banking_First_View();
        
        
    }
    public Banking_First_View getview()
    {
        return view;
    
    }
    public static void setLookandFeel()
    {
               try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } 
         catch (Exception ex) {
             JOptionPane.showMessageDialog(BankingSystem.view.firstview, "Unable to set Look and Feel", "Error", JOptionPane.ERROR_MESSAGE);
         }
    
    
    }
    
}
