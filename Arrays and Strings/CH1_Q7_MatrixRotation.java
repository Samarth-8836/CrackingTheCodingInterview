import java.util.Scanner;

public class CH1_Q7_MatrixRotation {
    public static void main(String[] args) {
        CH1_Q7_MatrixRotation instance = new CH1_Q7_MatrixRotation();
        Scanner sc = new Scanner(System.in);
        int inp = sc.nextInt();
        sc.nextLine();
        int[][] inputArray = new int[inp][inp];

        for(int i=0;i<inp;i++) {
            for(int j=0;j<inp;j++) {
                inputArray[i][j] = sc.nextInt();
                sc.nextLine();
            }
        }

        int[][] result = instance.rotateMatrix(inputArray);

        for(int i=0;i<inp;i++) {
            for(int j=0;j<inp;j++) {
                System.out.print(result[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }

    public int[][] rotateMatrix(int[][] inputArray) {
        int[][] duplicateArray = new int[inputArray.length][inputArray.length];
        for(int i=0;i<inputArray[0].length;i++) {
            for(int j=0;j<inputArray[0].length;j++) {
                duplicateArray[i][j] = inputArray[i][j];
            }
        }



        for(int i=0;i<inputArray[0].length;i++) {
            for(int j=0;j<inputArray[0].length;j++) {
                inputArray[i][j] = duplicateArray[inputArray.length - j - 1][i];
            }
        }

        return inputArray;
    }
}