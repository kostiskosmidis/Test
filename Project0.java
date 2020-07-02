/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project0;

import java.util.Scanner;

/**
 *
 * @author yo
 */
public class Project0 {

    

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("DeadBranch")
    public static void main(String[] args) {
        
    Scanner key = new Scanner(System.in); 
     
    
  
    
    Name(key);
    AgeYearCity();
    MarriedKidsColor();
    
    
   
    
    }
    public static void Name(Scanner key){
    key = new Scanner(System.in); 
    System.out.println("Whats your name ");
    String a = key.nextLine();
    System.out.println("Dear " + a);
    }
    public static void AgeYearCity() {
     Scanner key = new Scanner(System.in); 
     System.out.println("Whats year you were born ");
     int age = key.nextInt();
     
     int c = age;
     int b = 2020 - age;
    
   
    System.out.println(b);
    System.out.println("So you were born in " + age);
    
    System.out.println("Whats the name of the city you were born ");
    String m = key.next();
    System.out.println("And born in the city " + m);
    
    
    } 
    
    
    public static void MarriedKidsColor(){
           

    Scanner key = new Scanner(System.in); 
    System.out.println("are you married? ");
    System.out.println("TRUE OR FALSE" );
    
    
    Boolean kids = key.nextBoolean();  
    if (kids == true) { 
               
               System.out.println("How many years you are married" ); 
               int f = key.nextInt();
               System.out.println("You have been married for " + f + "years");
               System.out.println("Snd you got married in " + (2020 - f));
               
           } else if (kids == false) { 
               System.out.println("Whats your favorite color? ");
            String d = key.nextLine();
               System.out.println("my favorite color is " + key.nextLine());
               
           }
               System.out.println("Do you have any children? ");
               System.out.println("TRUE OF FALSE");
               
               boolean children = key.nextBoolean();
               if (children==true){
               System.out.println("how many kids you have ");
               int q = key.nextInt();
               
               
               int v = 0; 
               if(q ==0){
                      System.out.println("you dont have any childden ");
                      System.out.println("whats your favorite color ");
                      key.nextLine();
                      System.out.println("My favorite color is " + key.nextLine());
               } else if (q>0){
                 
                           for ( q = 1, v = 1; q <= 3 && v >= 0; q++, v++){
                           System.out.println("whats the name of your " + v + "child ");
                           String j =  key.next(); 
                           System.out.println("The name of your "  + v +  " child is " + j );  
                           System.out.println("\nwhats the age of your " + v +  " child ");
                           int o = key.nextInt();
                           System.out.println("the age of your " + v + " child is " + o);
                           System.out.println("the name of your children is "+ j + " and was born " + (2020 - o));
                           }
                  }
               
               
                   
               
           } else if (children==false){
                   System.out.println("Tell me your favorite color" + key.nextLine());
                    
               
                  
                      
    }
   
    
        
            
    

   
       
        
        

        
   
        

    
    
    
    
    
    
    
    
    }
    
    
    
   
}  

