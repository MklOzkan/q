package questions_anwsers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {

        /*
        3) Java Program to Find Duplicate Characters in a String
        This program finds duplicate characters in a given string.
        It iterates over the string and maintains a count of each character using a map.
        Then, it identifies characters with a count greater than one as duplicates.
         */


        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim().toLowerCase().replaceAll("[^a-z]", "");

        char[] c =s.toCharArray();

        //System.out.println(Arrays.toString(s));
        List<Character> characters = new ArrayList<>();
        char ch;

        for (Character w:c) {
            ch=w;
            int counter=0;
            if (!characters.contains(w)){
                characters.add(ch);
                for (Character t:c) {
                    if (ch==t){
                        counter++;
                    }
                }
                if( counter>1){
                    System.out.println(ch + " " + counter +" times, and it duplicated");
                }else{
                    System.out.println(ch + " " + counter +" times, and it is unique character");
                }
            }
        }

    }
}
