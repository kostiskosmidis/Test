/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdf;

import java.util.Scanner;

/**
 *
 * @author yo
 */
public class milia {
    
    
    
    
        public static double metatropi(double a ){
        
        final double To_km = 1.852;
        final double To_mile = 1.150779;
               
        //convert nautical to kms
        double inKms = a * To_km;
        return inKms;
        }
        
        public static double metatropi1(double b ){
        
        final double To_km = 1.852;
        final double To_mile = 1.150779;
               
        //convert nautical to kms
        double Tomile = b * To_mile;
        return Tomile;
}
}