import java.util.Scanner;

public class CH1_Q5_OneAway {
    public static void main(String[] args) {
        CH1_Q5_OneAway instance = new CH1_Q5_OneAway();
        Scanner sc = new Scanner(System.in);
        String inp1 = sc.nextLine();
        String inp2 = sc.nextLine();
        boolean result = instance.oneEditAway(inp1, inp2);
        System.out.println(result);
    }

    public boolean oneEditAway(String inp1, String inp2) {
        int difference = inp1.length() - inp2.length();
        if(difference <-1 || difference >1) {
            return false;
        }

        int[] char_set = new int[128];

        int ptr1 = 0, ptr2 = 0, negatives = 0;
        while(ptr1 < inp1.length() && ptr2 < inp2.length()) {
            char_set[inp1.charAt(ptr1)]++;
            char_set[inp2.charAt(ptr2)]--;
            if(char_set[inp2.charAt(ptr2)] < 0) {
                negatives++;
                if(negatives > 1) {
                    return false;
                }
            }
            if(ptr1 < inp1.length()) {
                ptr1++;
            }
            if(ptr2 < inp2.length()) {
                ptr2++;
            }
        }

        return true;
    }
}