/*
* The function takes in a string and returns true if all the characters
* in the string are unique otherwise it returns false.
* We can make an array of all possible ASCII codes (128) with initial value of false
* and then make it true when encountered with that value.
*
* We can also do the same with a hashmap if allowed.
*
* We can also achieve the same result by first sorting the String and then checking the neighbours
* */

import java.util.Scanner;

public class CH1_Q1_UniqueString {
    public static void main(String[] args) {
        CH1_Q1_UniqueString instance = new CH1_Q1_UniqueString();
        Scanner sc = new Scanner(System.in);
        String inp = sc.next();
        boolean result = instance.isUniqueChars(inp);
        System.out.println(result);
    }

    boolean isUniqueChars(String inp) {
        if(inp.length() > 128) {
            return false;
        }

        boolean[] char_set = new boolean[128];
        for(int i=0;i<inp.length();i++) {
            int check = inp.charAt(i);
            if(char_set[check] == true) {
                return false;
            }
            char_set[check] = true;
        }

        return true;
    }
}