import java.util.Scanner;

//This one is swap method....................but this method is only for square matrix.................
public class Transposem2 {
    static void Transposearr(int[][] arr, int r, int c) {
        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        Printarr(arr);
    }

    static void Printarr(int[][] arr) {
        System.out.println("The transposed matrix is:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Define the rows of the matrix");
        int r = sc.nextInt();
        System.out.println("Define the columns of the matrix");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Define the elements of the matrix:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        Transposearr(arr, r, c);
    }
}
