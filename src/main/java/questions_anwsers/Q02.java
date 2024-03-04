package questions_anwsers;

import java.util.Scanner;

public class Q02 {

    public static void main(String[] args) {

        /*
        2) Java Program to Check Palindrome String
        This program checks whether a given string is a palindrome or not.
        It compares characters from the beginning and end of the string, moving towards the middle,
        and if all characters match, it declares the string as a palindrome.
         */

        Scanner scan = new Scanner(System.in);

        String s = scan.next();
        String reversed = "";

        for (int i=s.length()-1; i>=0; i--){
            reversed = reversed + s.charAt(i);
        }

        if (s.equals(reversed)){
            System.out.println("the string "+ s+ " is palindrome");
        }else {
            System.out.println("The string " +s+ " is not palindrome");
        }
        scan.close();
    }
}
