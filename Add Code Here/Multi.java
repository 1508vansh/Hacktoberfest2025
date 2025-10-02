import java.util.Scanner;

public class Multi {
    static void Printarr(int[][] arr) {
        System.out.println("The multiplication of the given two matrixes is: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] Takeinpofelem(int[][] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    static void Multiplymatrix(int[][] arr1, int[][] arr2, int r1, int c1, int r2, int c2) {
        if (c1 != r2) {
            System.out.println("Invalid dimensions !..........cannot be multiplied.");
            return;
        }
        int[][] ans = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    ans[i][j] += arr1[i][k] * arr2[k][j];// Or we can take an int say ak = 0; and we can put it ak =
                                                         // arr1[i][k] * arr2[k][j]
                    // And then we can do ans[i][j] += ak; ............... but instead of doing this
                    // we did direct..........
                }
            }
        }
        Printarr(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Define the no. of rows for the first matrix");
        int rowsofm1 = sc.nextInt();
        System.out.println("Define the no. of columns for the first matrix");
        int colsofm1 = sc.nextInt();
        System.out.println("Define the elements for first matrix");
        int[][] arr1 = new int[rowsofm1][colsofm1];
        Takeinpofelem(arr1);
        System.out.println("Define the no. of rows for the second matrix");
        int rowsofm2 = sc.nextInt();
        System.out.println("Define the no. of columns for the second matrix");
        int colsofm2 = sc.nextInt();
        System.out.println("Define the elements for second matrix");
        int[][] arr2 = new int[rowsofm2][colsofm2];
        Takeinpofelem(arr2);
        Multiplymatrix(arr1, arr2, rowsofm1, colsofm1, rowsofm2, colsofm2);
    }
}