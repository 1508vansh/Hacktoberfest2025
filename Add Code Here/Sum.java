import java.util.Scanner;

//This code prints the sum of two matrixes................
public class Sum {
    static void Sum(int[][] m1, int[][] m2, int r, int c) {
        int[][] ans = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ans[i][j] = m1[i][j] + m2[i][j];
            }
        }
        Printarr(ans);
    }

    static void Printarr(int[][] arr) {
        System.out.println("The sum of the given two matrixes is: ");
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Define the no. of rows for the matrix");
        int rows = sc.nextInt();
        System.out.println("Define the no. of columns for the matrix");
        int cols = sc.nextInt();
        System.out.println("Define the elements for first matrix");
        int[][] arr1 = new int[rows][cols];
        Takeinpofelem(arr1);
        System.out.println("Define the elements for second matrix");
        int[][] arr2 = new int[rows][cols];
        Takeinpofelem(arr2);
        Sum(arr1, arr2, rows, cols);
    }
}