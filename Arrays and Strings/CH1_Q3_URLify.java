import java.util.Scanner;

public class CH1_Q3_URLify {
    public static void main(String[] args) {
        CH1_Q3_URLify instance = new CH1_Q3_URLify();
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        String inp2 = sc.nextLine();
        int trueLength = sc.nextInt();
        sc.nextLine();
        char[] inpArry = inp.toCharArray();
        System.out.println(inp+inp2);
        System.out.println(instance.replaceSpaces(inpArry, trueLength));
    }

    public char[] replaceSpaces(char[] inp,int trueLength) {
        int j = inp.length - 1;
        for(int i=trueLength - 1; i > -1; i--, j--) {
            if(Character.compare(inp[i], ' ') != 0) {
                inp[j] = inp[i];
            } else {
                inp[j] = '0';
                j--;
                inp[j] = '2';
                j--;
                inp[j] = '%';
            }
        }

        return inp;
    }
}