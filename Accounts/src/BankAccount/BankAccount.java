/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankAccount;

import java.util.ArrayList;
import java.util.List;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yo
 */
public class BankAccount {

    private int number;
    private double amount;
    private String name;
    private boolean active;
    private List<String> transaction;
    public static int AccountsOpened;
    

    public BankAccount() {
        active = true;
        AccountsOpened++;
        name = "ghost";
        transaction = new ArrayList();

    }

    public BankAccount(String name, int number) {
        this();
        this.name = name;
        this.number = number;
        while (number < 0) {
            try {
                System.out.println("TRY AGAIN  CAUSE YOU CANNOT PUT NEGATIVE ID");
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException ex) {
                Logger.getLogger(BankAccount.class.getName()).log(Level.SEVERE, null, ex);

            }

            System.exit(0);

        }

    }

    public BankAccount(String name, int number, double amount) {

        this.name = name;
        this.number = number;
        this.amount = amount;

    }

    public static int getAccountsOpened() {
        return AccountsOpened;

    }

    public int getNumber() {
        

        return number;
    }

    public void setNumber(int number) {

        this.number = number;
    }

    public double getAmount() {
        
        
        if (amount > 0) {
            active = true;
        } else {
            active = false;
        }
        return amount;
    }

   
    public String getName() {

       
        

        return name;

    }

    public void setName() {

        this.name = name;

    }

    public boolean getActive() {
        if (active == true) {
            System.out.println("Account's " + name + " status : Active");
        } else {
            System.out.println("Account's " + name + " status : Inactive");
        }
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void getTransaction() {

        for (int i = 0; i < transaction.size(); i++) {

            System.out.println(transaction.get(i));
        }

    }

    public void deposit(double money) {

        while (money < 0) {
            System.out.println("invalid transaction");
            
        }

        amount = amount + money;
        transaction.add("Created BankAccount with balance " + amount);
        transaction.add(" You add in your Account  " + money);
        System.out.println("You have " + amount + " in your account " + number);

    }

    public void withdraw(double money) {
        if (money > amount) {
            System.out.println("You took " + amount + ".");
            System.out.println(" No more money .");
            transaction.add("Remove " + amount);
            amount = 0;
            System.out.println("Your balance right now is " + amount);
        } else {
            amount = amount - money;
            transaction.add("Remove " + money);
            System.out.println("You have " + amount + " in your account  " + number);
        }

    }

//    
//    public static BankAccount constractAccounts(){
//       
//        BankAccount account = new BankAccount();
//        account.getName();
//        account.getNumber();
//        account.getAmount();
//        account.getActive();
//        
//        
//        
//        
//        return account;
//}
}
