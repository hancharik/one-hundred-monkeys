/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg100monkeys;

/**
 *
 * @author mark
 */
public class Transaction {
    
    private Monkey monkey;
    private MonkeyMerchant monkeyMerchant;
    private TownsFolk townsFolk;
    private int transactionId;
    
    
    public Transaction(Monkey m, MonkeyMerchant mm, TownsFolk t, int id){
       m.increasePrice(); 
    monkey = m;
    monkeyMerchant = mm;
    townsFolk = t;
    transactionId = id; 
    
    generateTransaction();
    
    }
    
    
  private void generateTransaction(){
      
     monkeyMerchant.sellMonkey(monkey, townsFolk, transactionId);
      System.out.println("transaction id#" + transactionId + " generated");
      //monkey.increasePrice();
      // monkeyMerchant.printReceiptBook();
  }  
    
    

}
