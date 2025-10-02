import java.util.Scanner;

public class Spiral {
    static void spiralmat(int[][] arr, int r, int c) {
        System.out.println("Spiral matrix is:");
        for (int i = 0; i < r - 3; i++) {// if r = 4, c = 5
            for (int j = i; j < c - i; j++) {
                System.out.print(arr[i][j] + " => ");
            }
            System.out.println();
            for (int j = i + 1; j <= c - 1 - i; j++) {// j<=4
                System.out.print(arr[j][c - 1 - i] + " => ");
            }
            System.out.println();
            for (int j = c - i - 1; j >= 1 + i; j--) {// j=4
                System.out.print(arr[r - i - 1][j - 1] + " => ");
            }
            System.out.println();
            for (int j = r - i - 1; j > i + 1; j--) {// j=3
                System.out.print(arr[j - 1][i] + " => ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("No. of rows");
        int r = sc.nextInt();
        System.out.println("No. of columns");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Print elements of matrix");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        spiralmat(arr, r, c);
    }
}