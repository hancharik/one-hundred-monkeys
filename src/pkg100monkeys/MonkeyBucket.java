/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg100monkeys;

/**
 *
 * @author mah537
 */
public class MonkeyBucket {
    
    
    Monkey[] bucket;// = new Monkey[100];
    
    
    
    public MonkeyBucket(){
    
    makeThemMonkeys(100);
    showThemMonkeys();
} // end constructor
                 
    
    
  private void makeThemMonkeys(int num){
     
      bucket = new Monkey[num];
      for(int m = 0; m < num; m++){
        
           bucket[m] = new Monkey(m);
          
      }
      
      
  } // end make them Monkeys 
    
    
    
  private void showThemMonkeys(){
     
      
      for(int m = 0; m < bucket.length; m++){
        
           System.out.println("Monkey #" + bucket[m].monkeyId);
          
      }
      
      
  } // end make them Monkeys     
    
    
    
    
    
} // end class
