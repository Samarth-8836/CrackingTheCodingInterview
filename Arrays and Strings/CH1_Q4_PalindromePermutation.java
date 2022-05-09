import java.util.Scanner;

public class CH1_Q4_PalindromePermutation {
    public static void main(String[] args) {
        CH1_Q4_PalindromePermutation instance = new CH1_Q4_PalindromePermutation();
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        boolean result = instance.isPermutationOfPalindrome(inp);
        System.out.println(result);
    }

    public boolean isPermutationOfPalindrome(String inp) {
        int[] char_map = new int[128];
        for(int i=0;i<inp.length();i++) {
            if(Character.compare(inp.charAt(i) , ' ') != 0) {
                char_map[inp.charAt(i)]++;
            }
        }

        int OddOne = -1;
        for(int i=0; i < inp.length(); i++) {
            if(char_map[inp.charAt(i)]%2 != 0) {
                if(OddOne == -1 || OddOne == inp.charAt(i)) {
                    OddOne = inp.charAt(i);
                } else {
                    return false;
                }
            } else {
                continue;
            }
        }

        return true;
    }
}