/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdf;

import java.util.Scanner;
import static pdf.milia.metatropi;
import static pdf.milia.metatropi1;

/**
 *
 * @author yo
 */
public class Pdf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        exercise3();

        int min = 0;
        int[] pinakas = new int[10];
        pinakas = exercise4();
        for (int i = 0; i < 10; i++) 
            System.out.println(pinakas[i]);
            
          
     
          
              

            int[] pinakas1 = new int[10];
            pinakas1 = exercise4a();
            for (int z = 9; z >= 0; z--) {
                System.out.println(pinakas1[z]);

            }

            {
                byte siblings = 2;
                byte grade = 10;
                long population = 7000000000000l;
                long populationUS = 350000000l;
                short passengers = 40;
                short yearEvent = 1821;
                int price = 10000;

                Scanner bla = new Scanner(System.in);
                double input = bla.nextDouble();
                double convert = metatropi(input);
                System.out.println(convert);

                double convert2 = metatropi1(input);
                System.out.println(convert2);

            }
        }

    

    public static void exercise3() {

        int sum = 0;
        int x = 1;
        sum = sum + x;

        System.out.println("The sum is " + sum);
    }

    public static int[] exercise4() {
        int[] intArray = new int[10];

        for (int i = 0; i < 10; i++) {

            intArray[i] = i;
        }
        return intArray;

    }

    public static int[] exercise4a() {
        int[] intArray1 = new int[10];

        for (int z = 9; z >= 0; z--) {

            intArray1[z] = z;
        }
        return intArray1;

    }
}
