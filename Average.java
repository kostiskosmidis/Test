public class Average {
 

   public static void main (String[] args) {



   double x = Double.parseDouble(args[0]);
   double y = Double.parseDouble(args[1]);
   double z = Double.parseDouble(args[2]);
   double sum = x + y + z ;
   double average = sum / 3;
   
   System.out.println("Average of " + args[0] + " , " + args[1] + "," + args[2] + " is :" + average );
   
    }

}   