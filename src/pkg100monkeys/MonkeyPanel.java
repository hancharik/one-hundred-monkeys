/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg100monkeys;

import java.awt.GridLayout;
import java.util.ArrayList;
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
    public MonkeyPanel(){
        
        super();
        
        
        monkeyTown = new MonkeyMarket();
        
        
        createUI();
        
        
        
    }  // end constructor
    
private void createUI(){
    
    
   // setLayout(new GridLayout(1 ,2));
    
    
    JPanel p1 = new JPanel();
    p1.setLayout(new GridLayout(10 ,10));
    
    JPanel p2 = new JPanel();
    p2.setLayout(new GridLayout(10 ,10));
    
    
   
    ArrayList<Monkey> a = monkeyTown.monkeys();
    for(int i = 0; i < a.size(); i++){
       JButton m = new JButton();
       //m.setText("" + a.get(i).getId());
        m.setText("" + a.get(i).getPrice());
       p1.add(m);
    }
    add(p1);
    
     ArrayList<TownsFolk> peopleWhoOwnMonkeys = monkeyTown.peopleWhoOwnMonkeys();
     
    for(int i = 0; i < peopleWhoOwnMonkeys.size(); i++){
       JButton pwm = new JButton();
       numMonkeyz =  numMonkeyz + peopleWhoOwnMonkeys.get(i).getNumberOfMonkeys();
       pwm.setText("" + peopleWhoOwnMonkeys.get(i).getNumberOfMonkeys());//b.setText("" + a.get(i).getPrice());
       p2.add(pwm);
    }
    add(p2);
    
    JLabel numberOfMonkeysLabel = new JLabel(peopleWhoOwnMonkeys.size() + " people own \n" + numMonkeyz + " monkeys");
    add(numberOfMonkeysLabel);
}   // end create UI 
    
    
}// end class
