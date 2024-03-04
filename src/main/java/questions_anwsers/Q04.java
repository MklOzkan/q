package questions_anwsers;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {
        /*
        4) Java Program to Find Duplicate Words in a String
        This program finds duplicate words in a given string.
        It tokenizes the string into words and then tracks the count of each word using a map.
        Words with a count greater than one are identified as duplicates.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a sentence or a paragraph");
        String[] list = scan.nextLine().toLowerCase().split(" ");
        List<String> check = new ArrayList<>();
        String s = "";

        for (String w: list) {
            s= w;
            int counter=0;
            if (!check.contains(w)){
                check.add(w);
                for (String t : list) {
                    if (Objects.equals(t, w)){
                        counter++;
                    }

                }if (counter>1){
                    System.out.println(w + " is " + counter + " repeated. And it is duplicated.");
                }else {
                    System.out.println(w + " is " + counter + " repeated. And it is unique word.");
                }
            }
        }
        scan.close();
    }
}
