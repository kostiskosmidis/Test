/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringpro;

import java.util.Scanner;

/**
 *
 * @author yo
 */
public class StringPro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String trims = input.next();

        Trims(trims);

        System.out.println(Concat("name", "surname"));

        System.out.println(ConcatLowerToUpper("name", "surname"));

        System.out.println(trims.trim());

        Replace("Computer, Laptop, Tablet");

        AcceptReturn(" URL=http://peoplecert.com/dasdkj;lasjkd;ajsd;lakjsda");

        print(SplitContains("Computer , Laptop , Tablet"));

    }

    public static String Concat(String name, String surname) {

        return (name.concat(surname));
    }

    public static String ConcatLowerToUpper(String name, String surname) {

        return (name.toUpperCase().concat(surname)).toUpperCase();
    }

    public static void Trims(String name) {

    }

    public static String[] SplitContains(String message) {

        if (message.contains(",")) {
            message = message.replace(", ", ",");

            return message.split(",");

        }
        return null;

    }

    public static void print(String[] message) {
        for (int i = 0; i < message.length; i++) {
            System.out.printf(message[i]);
        }
    }

    public static void Replace(String message) {
        message = message.replace(",", "-");
        System.out.println(message);
    }

    public static void AcceptReturn(String message) {

        System.out.println(message.substring(12, 26));
    }

}
