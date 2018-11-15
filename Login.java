/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author hallgato
 */
public class Login extends JFrame implements ActionListener{ 
    
    private JButton bt;
    private JButton bt1;
    private JButton bt2;
    private JButton bt3;
    private JButton bt4;
    private JButton bt5; 
    private JButton bt6;
        
        
    
    private JTextField tf1; 
    private JTextField tf2; 

    
    private JLabel lb1;
    private JLabel lb2;
    private JLabel lb3;
    
    private JPanel p1;
    private JPanel p2;
    private JPanel p3;
    private JPanel p4;
    private JPanel p5;
    private JPanel p6;   
   
    public Login(String title) throws HeadlessException {
        super(title);
       
        setVisible(true); //alapértelmezés szerint láthatatlan úgyhogy be kell állítanunk true-ra 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close művelet alapért értéke
        this.bt=new JButton("OK");
        this.bt1=new JButton("B1");
        this.bt2=new JButton("B2");
        this.bt3=new JButton("B2");
        this.bt4=new JButton("B3");
        this.bt5=new JButton("B4");
        this.bt6=new JButton("B5");
        
        
        
        this.tf1= new JTextField(30); //Oszlopok száma 30
        this.tf2= new JTextField(30);
        
        this.lb1= new JLabel("Username");
        this.lb2 = new JLabel("Password");
        this.lb3 = new JLabel(); 
        
        this.p1 = new JPanel();
        this.p2 = new JPanel();
        this.p3 = new JPanel();
        this.p4 = new JPanel();
        p5 = new JPanel();
        p6 = new JPanel();
        
        //FlowLayout f1= new FlowLayout(); //folytonosan sorbarendezi a hozzáadás sorrendjében
        GridLayout gr= new GridLayout(2,1);
        this.setLayout(gr); 
        GridLayout gr2= new GridLayout(2, 3);
        p5.setLayout(gr2);
        GridLayout gr3 = new GridLayout (4,1);
        p6.setLayout(gr3);
       
        
        p1.add(lb1); //első csempéhez adódik hoozzá
        p1.add(tf1);
        p2.add(lb2);//2ik csempéhez adja hozzá 
        p2.add(tf2);
        p3.add(bt); //3.ikhoz
        p4.add(lb3);//4.hez
        p5.add(bt1);
        p5.add(bt2);
        p5.add(bt3);
        p5.add(bt4);
        p5.add(bt5);
        p5.add(bt6);
        
        
        p6.add(p1);
        p6.add(p2); 
        p6.add(p3);
        p6.add(p4);
        
        this.add(p6); //ráadom a keretre 
        this.add(p5);
        
        bt.addActionListener(this);
        bt1.addActionListener(this);
        
        super.pack();
    
    }
    public static void main(String[] args) {
        Login log= new Login("Login"); 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getSource()==bt){
           if (tf1.getText().equals("lakatosfanni")&& tf2.getText().equals("prog2")) {
               lb3.setText("Sikerült..."); 
           }
           else lb3.setText("Error in username or pw.");
       } 
       
       if(e.getSource()==bt1){
           
           
           lb3.setText("Ügyes.xd");
       }
      
    }
   
}
