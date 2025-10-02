import java.util.*;

public class Matrix {
    public static void main(String[] args) {
        Scanner ohk = new Scanner(System.in);
        System.out.println("how many rows do you want?");
        int rows = ohk.nextInt();
        System.out.println("how many columns do you want?");
        int cols = ohk.nextInt();
        int[][] vansh = new int[rows][cols];
        // this 'for loop' is for input;
        System.out.println("define the numbers of rows and columns");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                vansh[i][j] = ohk.nextInt();
            }
        }
        System.out.println("enter the number you want to find");
        int x = ohk.nextInt();
        // this for loop is for output;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (vansh[i][j] == x) {
                    System.out.print("the x is found in the index : " + i + ", " + j);
                }
            }
            System.out.println();
        }

    }
}