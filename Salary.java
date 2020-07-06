

public class Salary {

         public static void main (String[] args){
         short salary = 900;
         short taxes = 9/100;

         short annualSalary = 900*12;
         int govermentTaxes = annualSalary * 9 / 100 ;
         System.out.println("the annual salary is :" + annualSalary);
         System.out.println("what the goverment keeps :" + govermentTaxes);
         System.out.println("the salary i keep :" + (annualSalary - govermentTaxes));
    }
}