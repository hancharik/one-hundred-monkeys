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
public class Monkey {
    
    public int monkeyId;
    private int price;
    
    public Monkey(int number){
        
       monkeyId = number + 1; 
       // we could set this as a variable, right now we just start at 100 dollars
       price = 100;
       
    
    }  // end constructor
    
    
 public void increasePrice(){
     
     int newprice = (price * 120)/100;
     
     System.out.print("monkey #" + monkeyId + " was $" + price );
     
     price = newprice;
     System.out.println( ", new price is $" + price);
 } 
    
   public int getPrice(){
       
       return price;
   } 
    
}  // end class
