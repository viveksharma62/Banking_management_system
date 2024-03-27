
package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;


/**
 *
 * @author Vivek sharma
 */
public class Login extends JFrame implements ActionListener{
     
    JButton login,singup,clear;
    JTextField cardTextField;
    JPasswordField pinTextField;
    
    Login(){
        setTitle("AUTOMATED TALLER MACHINE");
        
        setLayout(null);
        
        //images insert
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 =i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);
        
        // print the massage
        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward", Font.BOLD,38));
        text.setBounds(200,40,400,40);
        add(text);
         //card no 
        JLabel cardno = new JLabel("Card No:");
        cardno.setFont(new Font("Raleway", Font.BOLD,28));
        cardno.setBounds(120,150,150,30);
        add(cardno);
        
        //card box
        cardTextField = new JTextField();
        cardTextField.setBounds(300,150,230,30);
        cardTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(cardTextField);
        
        //pin 
        JLabel pin = new JLabel("PIN :");
        pin.setFont(new Font("Raleway", Font.BOLD,28));
        pin.setBounds(120,220,250,30);
        add(pin);
        
        //pin box
        pinTextField = new JPasswordField();
        pinTextField.setBounds(300,220,230,30);
        pinTextField.setFont(new Font("Arial",Font.BOLD,14));

        add(pinTextField);
        
        //button1 ke liye
        login = new JButton("SIGN IN");
        login.setBounds(300,300,100,30);
        login.setBackground(Color.black);
        login.setForeground(Color.white);
        login.addActionListener(this);
        add(login);
        
        //button2
         clear = new JButton("CLEAR ");
         clear.setBounds(430,300,100,30);
         clear.setBackground(Color.black);
         clear.setForeground(Color.white);
         clear.addActionListener(this);
         add(clear);
         
         //button3
         singup = new JButton("SING UP");
         singup.setBounds(300,350,230,30);
         singup.setBackground(Color.black);
         singup.setForeground(Color.white);
         singup.addActionListener(this);
         add(singup);
        
        
        
        getContentPane().setBackground(Color.white);
        
        setSize(800,480);
        setVisible(true);
        setLocation(350,200); 
    }
    //interfacce implement ke time
    public void actionPerformed(ActionEvent ae){
      if(ae.getSource()==clear) {
          cardTextField.setText("");
          pinTextField.setText("");
      } 
      else if(ae.getSource() == login){
         conn con = new conn();
         String cardnumber = cardTextField.getText();
         String pinnumber = pinTextField.getText();
         String query = "Select * from login where cardnumber ='"+cardnumber+"'and pin ='"+pinnumber+"'";
         try{
           ResultSet rs = con.s.executeQuery(query);
          if(rs.next()){
              setVisible(false);
              new Transactions(pinnumber).setVisible(true);
          }
          else {
              JOptionPane.showMessageDialog(null,"Incorrect card Number or Pin");
          }
              
         }
         catch (Exception e){
              e.printStackTrace();
         }
      }
      else if(ae.getSource()== singup){
          setVisible(false);
          new SingupOne().setVisible(true);
      }
    }
    
    public static void main(String[] args) {
        
        new Login();
    }
    
}


