/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;

import BankAccount.BankAccount;


/**
 *
 * @author yo
 */
public class Accounts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       BankAccount account1 = new BankAccount("AGROTIKH" , 12);
       account1.deposit(100);
       account1.withdraw(50);
       account1.getTransaction();
       
        BankAccount account2 = new BankAccount("Ethnikh" , 16);
        account2.deposit(1000);
        account2.deposit(50);
        account2.getTransaction();
        
       
       
       
       
       
      Person p1 = new Person("Mairh" , 22 , account1);
      
      Person p2 = new Person ("Bary" , 23 , account1);
      
      p1.printAccount();
      p2.printAccount();
              

    }
}
