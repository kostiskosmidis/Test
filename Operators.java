public class Operators{
  
    public static void main (String[] args){

   System.out.println("Give numbers :" + args[0] + " , " + args[1] + "." );

   double x = Double.parseDouble(args[0]);
   double y = Double.parseDouble(args[1]);

    System.out.println("is " + x + " greater than " + y + "? : " + (x>y));
    System.out.println("is " + x + " less than " + y + "? : " + (x<y));
    System.out.println("is " + x + " greater or equal  " + y + "? : " + (x>=y));
    System.out.println("is " + x + " less than or equal to  " + y + "? : " + (x<=y));
    System.out.println("is " + x + " equal to  " + y + "? : " + (x==y));
    System.out.println("is " + x + " not equal to " + y + "? : " + (x!=y));
    




     }
}