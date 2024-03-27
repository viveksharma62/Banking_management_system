
package bank.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class SingupTwo extends JFrame implements ActionListener{
    
  
     JTextField  pan,aadhar;
     JButton next;
     JRadioButton syes,sno,eyes,eno;
     JComboBox religion,category,occupation,education,income;
     String formno;
     
        SingupTwo(String formno){
            this.formno = formno;
            
            setLayout(null);
            
            setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
            
            
            // label
            JLabel additionalDetails = new JLabel("page. 2: additional Details"); 
            additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
            additionalDetails.setBounds(290,80,400,30);
            add(additionalDetails);
            
             //1st label
            JLabel name = new JLabel("Religion:"); 
            name.setFont(new Font("Raleway",Font.BOLD,20));
            name.setBounds(100,140,100,30);
            add(name);
            
            //combo box
            String valreligion[] = {"Hindu" , "Muslim","Sikh","Christian","Other"};
            religion = new JComboBox(valreligion);
            religion.setBounds(300,140,400,30);
            religion.setBackground(Color.white);
            add(religion);
            
            
            //2nd label
            JLabel fname = new JLabel(" Category:"); 
            fname.setFont(new Font("Raleway",Font.BOLD,20));
            fname.setBounds(100,190,200,30);
            add(fname);
            
            
            String valcategory[] = {"General","OBC","SC","ST","Other"};
            category = new JComboBox(valcategory);
            category.setBounds(300,190,400,30);
            category.setBackground(Color.white);
            add(category);
            
            //3rd label
            JLabel dod = new JLabel(" Income:"); 
            dod.setFont(new Font("Raleway",Font.BOLD,20));
            dod.setBounds(100,240,200,30);
            add(dod);
            
            String incomecategory[] = {"NUll","<1,50,000","<2,50,000","<5,00,000","upto 10,00,000"};
            income = new JComboBox(incomecategory);
            income.setBounds(300,240,400,30);
            income.setBackground(Color.white);
            add(income);
            
            
            //4th label
            JLabel gender = new JLabel(" Educational:"); 
            gender.setFont(new Font("Raleway",Font.BOLD,20));
            gender.setBounds(100,290,200,30);
            add(gender);
            
            
             //5th label
            JLabel email = new JLabel("Qualification:"); 
            email.setFont(new Font("Raleway",Font.BOLD,20));
            email.setBounds(100,320,200,30);
            add(email);
            
            String educationvalues[] = {"Non Graduation","Graduation","Post Graduation","Doctrate","Others"};
            education = new JComboBox(educationvalues);
            education.setBounds(300,320,400,30);
            education.setBackground(Color.white);
            add(education);
                       
            //6th label
            JLabel Marital = new JLabel(" Occupation:"); 
            Marital.setFont(new Font("Raleway",Font.BOLD,20));
            Marital.setBounds(100,390,200,30);
            add(Marital);
            
             String Occupationvalues[] = {"salaried","self-Employed","Bussiness","Student","Retired","Others"};
            occupation = new JComboBox(Occupationvalues);
            occupation.setBounds(300,390,400,30);
            occupation.setBackground(Color.white);
            add(occupation);
            
             
             //7th label
            JLabel panno = new JLabel(" PAN number:"); 
            panno.setFont(new Font("Raleway",Font.BOLD,20));
            panno.setBounds(100,440,200,30);
            add(panno);
            
             //textfield address
            pan = new JTextField();
            pan.setFont(new Font("Raleway", Font.BOLD,14));
            pan.setBounds(300,440,400,30);
            add(pan);
            
             //8th label
            JLabel adharno = new JLabel(" Aadhar number:"); 
            adharno.setFont(new Font("Raleway",Font.BOLD,20));
            adharno.setBounds(100,490,200,30);
            add(adharno);
            
             //textfield city
            aadhar = new JTextField();
            aadhar .setFont(new Font("Raleway", Font.BOLD,14));
            aadhar .setBounds(300,490,400,30);
            add(aadhar );
            
            
             //9th label
            JLabel state = new JLabel(" Senior Citizen:"); 
            state.setFont(new Font("Raleway",Font.BOLD,20));
            state.setBounds(100,540,200,30);
            add(state);
            
            //radio button
          
             syes = new JRadioButton("Yes");
             syes.setBounds(300,540,100,30);
             syes.setBackground(Color.white);
             add(syes);
             
             sno = new JRadioButton("No");
             sno.setBounds(450,540,100,30);
             sno.setBackground(Color.white);
             add(sno);
             
             //Button group object
             ButtonGroup SeniorCitizengroup = new ButtonGroup();
             SeniorCitizengroup.add(syes);
             SeniorCitizengroup.add(sno);
           
            
             //10th label
            JLabel pincode = new JLabel(" Exisition account:"); 
            pincode.setFont(new Font("Raleway",Font.BOLD,20));
            pincode.setBounds(100,590,200,30);
            add(pincode);
            
             eyes = new JRadioButton("Yes");
             eyes.setBounds(300,590,100,30);
             eyes.setBackground(Color.white);
             add(eyes);
             
             eno = new JRadioButton("No");
             eno.setBounds(450,590,100,30);
             eno.setBackground(Color.white);
             add(eno);
             
             //Button group object
             ButtonGroup Exisitionaccountgroup = new ButtonGroup();
             Exisitionaccountgroup.add(eyes);
             Exisitionaccountgroup.add(eno);
            
            
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
//         String formno ="" +random;
         String sreligion = (String) religion.getSelectedItem();
         String scategory = (String) category.getSelectedItem();
         String sincome = (String) income.getSelectedItem();
         String seducation = (String) education.getSelectedItem();
         String soccupation = (String) occupation.getSelectedItem();
         
         String seniorcitizen = null;
         if(syes.isSelected()){
             seniorcitizen ="Yes";
         }
         else if(sno.isSelected()){
             seniorcitizen ="No";
         }
         
         String existingaccount = null;
         if(eyes.isSelected()){
             existingaccount = "Yes";
         }
         else if(eno.isSelected()){
             existingaccount = "No";
         }
         
          String span = pan.getText();
          String saadhar = aadhar.getText();
          
          try{
                  conn cn = new conn();
                  String query = "INSERT INTO signuptwo (formno, religion, category, income, education, occupation, pan, aadhar, seniorcitizen, existingaccount) VALUES ('"+formno+"','"+sreligion+"', '"+scategory+"', '"+sincome+"', '"+seducation+"', '"+soccupation+"', '"+span+"','"+saadhar+"', '"+seniorcitizen+"', '"+existingaccount+"'); ";
                 int i=cn.s.executeUpdate(query);
                 System.out.print(i);
                 
                // signup3 object
                setVisible(false);
                new SingupThree(formno).setVisible(true);
          
          }catch (Exception e){
              e.printStackTrace();
          }
    }
    
    public static void main(String args[]) {
      new SingupTwo("");
    }
}
