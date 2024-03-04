package questions_anwsers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {
         /*
        5) Java Program to Find All the Permutations of a String
        This program finds all possible permutations of a given string.
        It recursively generates permutations by swapping characters at different positions within the string.
        Each permutation is then printed or stored for further processing.
         */

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = str.length();

        List<String> per = new ArrayList<>();

        per.add(String.valueOf(str.charAt(0)));

        for (int i = 1; i < n; i++) {
            char ch = str.charAt(i);
            List<String> newPer = new ArrayList<>();

            for (String s:per) {
                int length = s.length();

                for (int j = 0; j <= length; j++) {
                    newPer.add(s.substring(0,j) + ch + s.substring(j));
                }
            }

            per=newPer;
        }
       Collections.sort(per);
        System.out.println(per);
    }
}
