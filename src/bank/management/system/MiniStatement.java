
package bank.management.system;


import java.awt.*;
import javax.swing.*;
import java.sql.*;


public class MiniStatement extends JFrame {
    JLabel balance,bank,mini,card;
    String pinnumber;
    
    MiniStatement(String pinnumber){
        setTitle("Mini Statement");
        
        setLayout(null);
        
        mini = new JLabel();
        add(mini);
        
        bank = new JLabel("Bank Of India");
        bank.setBounds(150,20,100,20);
        add(bank);
        
        card = new JLabel();
        card.setBounds(20,80,300,20);
        add(card);
        
        balance = new JLabel();
        balance.setBounds(20,400,300,20);
        add(balance);
        
        try{
            conn conn = new conn();
         ResultSet rs =  conn.s.executeQuery("select * from login where pin = '"+pinnumber+"' ");
          while(rs.next()){
            card.setText("Card Number: " +rs.getString("cardnumber").substring(0,4) + "XXXXXXXX"+rs.getString("cardnumber").substring(12));
        } 
        }catch(Exception e){
            System.out.println(e);
        }
        
        try{
            conn con = new conn();
            int bal = 0;
            ResultSet rst =  con.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
            while(rst.next()){
              mini.setText(mini.getText()+"<html>" +rst.getString("date")+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rst.getString("type")+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rst.getString("amount") +"<br><br></html>" );
              if(rst.getString("type").equals("Deposit")){
                     bal +=Integer.parseInt(rst.getString("amount"));
                 }else{
                     bal -= Integer.parseInt(rst.getString("amount"));
                 }
            }
            balance.setText("Your current Account balance  is Rs " + bal);
        }catch(Exception e){
            e.printStackTrace();
        }
        
        mini.setBounds(20,140,400,200);
        
        setSize(400,600);
        setLocation(20,20);
        getContentPane().setBackground(Color.white);
        setVisible(true);
        
    }
    
    public static void main(String[] args) {
        new MiniStatement("");
    }
}

//video pending 11:59 