/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg100monkeys;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author mark
 */
public class MonkeyPanel extends JPanel{
    
    MonkeyMarket monkeyTown;
    int numMonkeyz = 0;
    JLabel numberOfMonkeysLabel;
    JLabel trustTheMonkeysLabel;
    JLabel titleLabel;
     ArrayList<TownsFolk> peopleWhoOwnMonkeys;     
     JButton monkeyPic;
            
    public MonkeyPanel(){
        
        super();
        
        
        monkeyTown = new MonkeyMarket();
        
        
        createUI();
        
        setLabel();
        
    }  // end constructor
    
private void createUI(){
    
    
    setLayout(null);
    
    monkeyPic = new JButton();
    monkeyPic.setIcon(new ImageIcon("images/monkey.jpg"));
    monkeyPic.setBounds(688,164,130,127);
    
    JPanel p1 = monkeyPanel();
    
    p1.setBounds(20,20,550,550);
    
    JPanel p2 = peopleWithMonkeysPanel();
    
    p2.setBounds(80,590,420,360);
     add(p1);
      add(p2);
      add(monkeyPic);
 
    

    
    numberOfMonkeysLabel = new JLabel("yo!");
    numberOfMonkeysLabel.setBounds(538,590,420,42);
    add(numberOfMonkeysLabel);
    trustTheMonkeysLabel = new JLabel("trust!");
    trustTheMonkeysLabel.setBounds(538,640,420,42);
    add(trustTheMonkeysLabel);
    titleLabel = new JLabel("100 monkeys");
    titleLabel.setBounds(688,64,420,42);
    titleLabel.setBackground(Color.yellow);
    add(titleLabel);
    
    
}   // end create UI 
 
private JPanel monkeyPanel(){
      JPanel monkPan = new JPanel();
      monkPan.setLayout(new GridLayout(10 ,10));
    ArrayList<Monkey> a = monkeyTown.monkeys();
    for(int i = 0; i < a.size(); i++){
       JButton m = new JButton();
       //m.setText("" + a.get(i).getId());
        m.setText("" + a.get(i).getPrice());
       monkPan.add(m);
    }
   return monkPan;
} // end monkey panel



 private JPanel peopleWithMonkeysPanel(){
     JPanel peepsWithMonkPan = new JPanel();
     peepsWithMonkPan.setLayout(new GridLayout(10 ,10));
         peopleWhoOwnMonkeys = monkeyTown.peopleWhoOwnMonkeys();
    // String bannre = peopleWhoOwnMonkeys.size() + " people own " + numMonkeyz + " monkeys";
     //numberOfMonkeysLabel.setText(bannre);
    for(int i = 0; i < 100 ; i++){
       JButton pwm = new JButton();
       
       if(i<peopleWhoOwnMonkeys.size()){
           numMonkeyz =  numMonkeyz + peopleWhoOwnMonkeys.get(i).getNumberOfMonkeys();
       pwm.setText("" + peopleWhoOwnMonkeys.get(i).getNumberOfMonkeys());//b.setText("" + a.get(i).getPrice());
       }else{
          pwm.setBackground(Color.black);
       }
       peepsWithMonkPan.add(pwm);
    }
    return peepsWithMonkPan;
} // end people with monkeys panel   
 
 public void setLabel(){
     
      String bannre = peopleWhoOwnMonkeys.size() + " people own " + numMonkeyz + " monkeys";
       String bannre2 = "<html><h2><font color='blue'>" + peopleWhoOwnMonkeys.size() + " people own "  + "</font><font color='red'>" + numMonkeyz + " monkeys" + "</font><h2></html>";
       String bannre3 = "<html><h2><font color='blue'>" +  "trust me!"  + "</font><font color='red'>" +  " ... just kidding, this needs afixin'" + "</font><h1></html>";
       String bannre4 = "<html><h1><font color='black' >" +  "100 monkeys"  + "</font></h1></html>";
     numberOfMonkeysLabel.setText(bannre2); 
     trustTheMonkeysLabel.setText(bannre3); 
     titleLabel.setText(bannre4); 
 }
 
 
 
}// end class
