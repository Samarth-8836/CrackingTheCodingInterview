import java.util.Scanner;

public class CH1_Q6_StringCompression {
    public static void main(String[] args) {
        CH1_Q6_StringCompression instance = new CH1_Q6_StringCompression();
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        String result = instance.compress(inp);
        System.out.println(result);
    }

    public String compress(String inp) {
        StringBuilder answer = new StringBuilder(inp.length());
        int start = 0;
        boolean moreThanOne = false;
        while(start < inp.length()) {
            answer.append(inp.charAt(start));
            String temp = getCompressNumber(inp, start);
            answer.append(temp);
            start += Integer.valueOf(temp);
            if(Integer.valueOf(temp) > 1) {
                moreThanOne = true;
            }
        }
        if(moreThanOne) {
            return answer.toString();
        }
        return inp;
    }

    public String getCompressNumber(String inp, int start) {
        int count = 1, i = 1;
        while(i+start < inp.length() && inp.charAt(i+start) == inp.charAt(start)) {
            count++;
            i++;
        }
        return String.valueOf(count);
    }
}