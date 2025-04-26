
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Venray Acer 02
 */
class jLabelUsername {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame ("Login");
        
        JTextField jTextFieldUsername = new JTextField();
        JPasswordField jPassswordPassword = new JPasswordField();
        JLabel jLabel = new JLabel("Username");
        JLabel jLabelPassword = new JLabel("Password");
        JButton jButtonEnter = new JButton("Enter");
        JButton jButtonCancel = new JButton("Cancel");
      
    
        
        jFrame.setLayout(new GridLayout(3, 2));
        jFrame.getContentPane().add(jTextFieldUsername);
        jFrame.getContentPane().add(jLabelPassword);
        jFrame.getContentPane().add(jButtonEnter);
        jFrame.getContentPane().add(jButtonCancel);
        
        
        
        
        
        
      
        jFrame.setBounds(600, 400, 300, 250);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    
}



