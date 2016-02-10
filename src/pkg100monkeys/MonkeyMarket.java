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
    
    
    private int numberOfMerchants = 10;
    private int numberOfTownsPeople = 100;
    private int numberOfTransactions = 1;
    
    
    
    
    
    private ArrayList<Monkey> monkeyBucket;
    private ArrayList<MonkeyMerchant> monkeyMerchants;
    private ArrayList<TownsFolk>  town;
    private ArrayList<TownsFolk> monkeyOwners;
    private ArrayList<Transaction> transactions;
    
    
    public MonkeyMarket(){
    
       
        makeMarket();
        generateMonkeyEconomy(numberOfTransactions);
 
        generateSalesLogs();
    } // end constructor
    
 private void makeMarket(){
     
     MonkeyBucket mobu = new MonkeyBucket();
        monkeyBucket = mobu.bucket;
        makeMonkeyMerchants(numberOfMerchants);
        makeTownsFolk(numberOfTownsPeople);
     
 }   // end make market
 
 private void makeMonkeyMerchants(int numberOfMerchants){
     
      monkeyMerchants = new ArrayList<MonkeyMerchant>();
      for(int s = 0; s < numberOfMerchants; s++){
       MonkeyMerchant mm = new MonkeyMerchant(s); 
       monkeyMerchants.add(mm);
       System.out.println("monkey merchant #" + mm.getMerchantId() + " created, vendor size :" + monkeyMerchants.size());
      }
     
 }
 
  private void makeTownsFolk(int numberOfTownies){
     
      town = new ArrayList();
      monkeyOwners = new ArrayList();
      for(int s = 0; s < numberOfTownies; s++){
       TownsFolk townie = new TownsFolk(s); 
        town.add(townie);
       System.out.println("townsfolk #" + (s+1) + "(ssn #" + townie.getSSN() + ") created, town size :" + town.size());
      
      }
     
 }

  
   private void generateMonkeyEconomy(int numberOfTransactions){
     
       transactions = new ArrayList();
       
       for(int i = 1; i <= numberOfTransactions; i++){
       
       int randomMonkey = (int)(Math.random()*monkeyBucket.size());
       int randomMerchant = (int)(Math.random()*monkeyMerchants.size());
       int randomCustomer = (int)(Math.random()*town.size());
       
       Transaction tempTrans = new Transaction(monkeyBucket.get(randomMonkey), monkeyMerchants.get(randomMerchant),town.get(randomCustomer), (transactions.size()+1));
       tempTrans.generateTransaction();
       transactions.add(tempTrans);
      System.out.println(" monkey transaction #" + i + " created.");
     
       } // end for loop
       
         System.out.println(" there should be " + transactions.size() + " transactions.");
       
 }   // end generate monkey economy
  
 
   
 private void generateSalesLogs(){
     
     for(int i = 0; i < monkeyMerchants.size(); i++){
         monkeyMerchants.get(i).printReceiptBook();
     }
     // generate visible banner
     for(int i = 0; i <6; i++){
         System.out.println("//////////////////generating sales logs//////////////////////");
     }
  
      for(int i = 0; i < monkeyBucket.size(); i++){
         monkeyBucket.get(i).printTransactions();
     }
     
 }  // end generate sales logs
   
   
   
    
}  // end class
