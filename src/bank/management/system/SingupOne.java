
package bank.management.system;

import com.toedter.calendar.JDateChooser;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
import java.lang.*;
public class SingupOne extends JFrame implements ActionListener{
    
     long random;
     JTextField nameTextField,fnameTextField,dobTextField,gmailTextField,addressTextField, cityTextField ,stateTextField ,pincodeTextField;
     JButton next;
     JRadioButton male,female,other,married,unmarried;
     JDateChooser dateChooser;
        SingupOne(){
            
            setLayout(null);
            
           Random ran = new Random();
            random = Math.abs((ran.nextLong()  % 9000L) + 1000L);
            
            // label
            JLabel formno = new JLabel("APPLICATION FORM NO." + random ); 
            formno.setFont(new Font("Raleway",Font.BOLD,38));
            formno.setBounds(140,20,600,40);
            add(formno);
            
            // label
            JLabel personDetails = new JLabel("page. 1: Personal Details"); 
            personDetails.setFont(new Font("Raleway",Font.BOLD,22));
            personDetails.setBounds(290,80,400,30);
            add(personDetails);
            
             //1st label
            JLabel name = new JLabel("Name:"); 
            name.setFont(new Font("Raleway",Font.BOLD,20));
            name.setBounds(100,140,100,30);
            add(name);
            
            
            //textfield name
            nameTextField = new JTextField();
            nameTextField.setFont(new Font("Raleway", Font.BOLD,14));
            nameTextField.setBounds(300,140,400,30);
            add(nameTextField);
            
            //2nd label
            JLabel fname = new JLabel(" Father's Name:"); 
            fname.setFont(new Font("Raleway",Font.BOLD,20));
            fname.setBounds(100,190,200,30);
            add(fname);
            
            //textfield father name
            fnameTextField = new JTextField();
            fnameTextField.setFont(new Font("Raleway", Font.BOLD,14));
            fnameTextField.setBounds(300,190,400,30);
            add(fnameTextField);
            
            //3rd label
            JLabel dod = new JLabel(" Date of birth:"); 
            dod.setFont(new Font("Raleway",Font.BOLD,20));
            dod.setBounds(100,240,200,30);
            add(dod);
            
            //date of birth field
            dateChooser = new JDateChooser();
            dateChooser.setBounds(300,240,400,30);
            dateChooser.setForeground(new Color(105,105,105));
            add(dateChooser);
            
            //4th label
            JLabel gender = new JLabel(" Gender:"); 
            gender.setFont(new Font("Raleway",Font.BOLD,20));
            gender.setBounds(100,290,200,30);
            add(gender);
            
             //radio button
          
              male = new JRadioButton("Male");
             male.setBounds(300,290,60,30);
             male.setBackground(Color.white);
             add(male);
             
             female = new JRadioButton("Female");
             female.setBounds(450,290,120,30);
             female.setBackground(Color.white);
             add(female);
             
             
             //Button group object
             ButtonGroup gendergroup = new ButtonGroup();
             gendergroup.add(male);
             gendergroup.add(female);
            
             //5th label
            JLabel email = new JLabel(" Email Address:"); 
            email.setFont(new Font("Raleway",Font.BOLD,20));
            email.setBounds(100,340,200,30);
            add(email);
            
            //textfield gmail
            gmailTextField = new JTextField();
            gmailTextField.setFont(new Font("Raleway", Font.BOLD,14));
            gmailTextField.setBounds(300,340,400,30);
            add(gmailTextField);
            
            //6th label
            JLabel Marital = new JLabel(" Marital Status:"); 
            Marital.setFont(new Font("Raleway",Font.BOLD,20));
            Marital.setBounds(100,390,200,30);
            add(Marital);
            
             //radio button
          
             married = new JRadioButton("Married");
             married.setBounds(300,390,100,30);
             married.setBackground(Color.white);
             add(married);
             
             unmarried = new JRadioButton("Unmarried");
             unmarried.setBounds(450,390,100,30);
             unmarried.setBackground(Color.white);
             add(unmarried);
             
             other = new JRadioButton("Other");
             other.setBounds(630,390,100,30);
             other.setBackground(Color.white);
             add(other);
             
             
             //Button group object
             ButtonGroup marritalgroup = new ButtonGroup();
             marritalgroup.add(married);
             marritalgroup.add(unmarried);
             marritalgroup.add(other);
            
            
             //7th label
            JLabel address = new JLabel(" Address:"); 
            address.setFont(new Font("Raleway",Font.BOLD,20));
            address.setBounds(100,440,200,30);
            add(address);
            
             //textfield address
            addressTextField = new JTextField();
            addressTextField.setFont(new Font("Raleway", Font.BOLD,14));
            addressTextField.setBounds(300,440,400,30);
            add(addressTextField);
            
             //8th label
            JLabel city = new JLabel(" City:"); 
            city.setFont(new Font("Raleway",Font.BOLD,20));
            city.setBounds(100,490,200,30);
            add(city);
            
             //textfield city
            cityTextField = new JTextField();
            cityTextField .setFont(new Font("Raleway", Font.BOLD,14));
            cityTextField .setBounds(300,490,400,30);
            add(cityTextField );
            
            
             //9th label
            JLabel state = new JLabel(" State:"); 
            state.setFont(new Font("Raleway",Font.BOLD,20));
            state.setBounds(100,540,200,30);
            add(state);
            
             //textfield state
            stateTextField = new JTextField();
            stateTextField .setFont(new Font("Raleway", Font.BOLD,14));
            stateTextField .setBounds(300,540,400,30);
            add(stateTextField );
            
            
             //10th label
            JLabel pincode = new JLabel(" Pincode:"); 
            pincode.setFont(new Font("Raleway",Font.BOLD,20));
            pincode.setBounds(100,590,200,30);
            add(pincode);
            
            //textfield pincode
             pincodeTextField = new JTextField();
            pincodeTextField .setFont(new Font("Raleway", Font.BOLD,14));
            pincodeTextField .setBounds(300,590,400,30);
            add(pincodeTextField );
            
            
            next = new JButton("Next");
            next.setBackground(Color.black);
            next.setForeground(Color.white);
            next.setFont(new Font("Raleway",Font.BOLD,14));
            next.setBounds(620,660,80,30);
            next.addActionListener(this);
            add(next);
            
            
            getContentPane().setBackground(Color.white);
            
            setSize(850,800);
            setLocation(350,10);
            setVisible(true);
        }
     @Override
       public void actionPerformed(ActionEvent ae){
         String formno ="" +random;
         String name = nameTextField.getText();
         String fname = fnameTextField.getText();
         String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
         String gender = null;
         if(male.isSelected()){
             gender ="Male";
         }
         else if(female.isSelected()){
             gender ="Female";
         }
         
         String email = gmailTextField.getText();
         String marital = null;
         if(married.isSelected()){
             marital = "Marital";
         }
         else if(unmarried.isSelected()){
             marital = "Unmarital";
         }
          else if(other.isSelected()){
             marital = "Other";
         }
         
          String address = addressTextField.getText();
          String city = cityTextField.getText();
          String state = stateTextField.getText();
          String pin = pincodeTextField.getText();
          
          try{
             if(name.equals("")){
                 JOptionPane.showMessageDialog(null, "Name is required");
             } 
             else {
                 conn cn = new conn();
//                 String query ="insert into signup values(NULLs,'"+name+"','"+fname+",'"+dob+",'"+gender+",'"+email+",'"+marital+",'"+address+",'"+city+",'"+state+",'"+pin+"')";
//                 String query="INSERT INTO signup (formno, name, father_name, dob, Gender, Email, marital_status, Address, city, state, pincode) VALUES (NULL,'"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"','"+address+"', '"+city+"', '"+state+"', '"+pin+"'); ";
                  String query= "INSERT INTO signup (formno, name, father_name, dob, gender, email, marital_status, Address, city, state, pincode) VALUES ('"+formno+"','"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"','"+address+"', '"+city+"', '"+state+"', '"+pin+"'); ";
                 int i=cn.s.executeUpdate(query);
                 System.out.print(i);
                 
                 
                  setVisible(false);
                 new SingupTwo(formno).setVisible(true);
                 System.out.print(i);
             }
          }catch (Exception e){
              e.printStackTrace();
          }
    }
    
    public static void main(String args[]) {
      new SingupOne();
    }
}
