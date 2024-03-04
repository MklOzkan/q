package questions_anwsers;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {

        /*
            1)Java Program to Find the First Non-repeated Character in a String*
        This program finds the first non-repeated character in a given string.
        It iterates over the string, tracking the count of each character using a map,
        and then finds the first character with a count of one.
         */

        Scanner scan = new Scanner(System.in);

        String s= scan.nextLine().trim().toLowerCase().replaceAll(" ", "");

        for (int i=0; i< s.length(); i++) {

            if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))){
                System.out.println(s.charAt(i));
                break;
            }
        }
        scan.close();
    }
}
