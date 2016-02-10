/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg100monkeys;

import java.util.ArrayList;

/**
 *
 * @author mah537
 */
public class MonkeyMarket {
    
    
    private MonkeyBucket monkeyBucket;
    private ArrayList monkeyMerchants;
    private ArrayList town;
    
    
    public MonkeyMarket(){
    
       
        makeMarket();
        
        
    } // end constructor
    
 private void makeMarket(){
     
        monkeyBucket = new MonkeyBucket();
        makeMonkeyMerchants(40);
        makeTownsFolk(100);
     
 }   // end make market
 
 private void makeMonkeyMerchants(int numberOfMerchants){
     
      monkeyMerchants = new ArrayList();
      for(int s = 0; s < numberOfMerchants; s++){
       MonkeyMerchant mm = new MonkeyMerchant(s); 
       monkeyMerchants.add(mm);
       System.out.println("monkey merchant #" + mm.getMerchantId() + " created, vendor size :" + monkeyMerchants.size());
      }
     
 }
 
  private void makeTownsFolk(int numberOfTownies){
     
      town = new ArrayList();
      for(int s = 0; s < numberOfTownies; s++){
       TownsFolk townie = new TownsFolk(s); 
       
       System.out.println("townsfolk #" + s + "(ssn #" + townie.getSSN() + ") created, town size :" + town.size());
       town.add(townie);
      }
     
 }
 
 
    
}  // end class
