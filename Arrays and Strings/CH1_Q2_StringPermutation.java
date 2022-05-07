/*
* The function takes in 2 strings anc checks if they are the permutation of each other.
* This can be done by initializing an array with 0 then adding 1 to each ASCII coded index
* and then reducing 1 on each ASCII coded index on the second string.
* If anytime the count of any array value goes below 0, then it is not a permutation.
*
* The same can be achieved by implementing a hashmap.
*
* A less effective solution can be to sort the strings and then compare them.
* */

import java.util.Scanner;

public class CH1_Q2_StringPermutation {
    public static void main(String[] args) {
        CH1_Q2_StringPermutation instance = new CH1_Q2_StringPermutation();
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        sc.nextLine();
        String s2 = sc.next();
        boolean result = instance.permutation(s1, s2);
        System.out.println(result);
    }

    boolean permutation(String s1, String s2) {
        if(s1.length() != s2.length()) {
            return false;
        }

        int[] char_set = new int[128];

        char[] as1 = s1.toCharArray();
        char[] as2 = s2.toCharArray();
        for(char c : as1) {
            char_set[c]++;
        }

        for(int i=0;i<s2.length();i++) {
            char_set[(int)as2[i]]--;
            if(char_set[(int)as2[i]] < 0) {
                return false;
            }
        }
        return true;
    }
}