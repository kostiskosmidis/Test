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
public class Person {
    private String name;
    private int age ;
    private BankAccount account;
    
    
    
    Person(){
        
    }
    
    
    
    Person(String name){
        
        this.name = name;
        
    }
    Person (String name , int age ){
        this(name);
        
        this.age = age;
        
    }
    Person (String name , int age , BankAccount account){
        this(name , age);
        this.account = account;
    }
    
    
    public String getName(){
        
       
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    
    public int getAge(){
        return age;
       
    }
    public void setAge(int age){
        this.age = age;
    }
    
    public BankAccount getAccounts(){
                return account;
    }
    
    public void printAccount(){
		System.out.println(name + " has " + getAccounts().getAmount() + " in his account.");
	}
    
    
       
        
    }
    
   
    
    
    

