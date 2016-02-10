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
public class TownsFolk {
   
    private int ssn;
    
    
    public TownsFolk(int id){
    
        //ssn = id;
        ssn = setSSN();
}
    
 
    
    
 private int setSSN(){
    int tempssn = (int)( Math.random()*1000);
     int xInt = (int)(Math.random()*30);
     return tempssn;
 }
    
    
    
    
    public int getSSN(){
        
        return ssn;
    }
}
