import java.util.Scanner;

//This one is best method to transpose matrix 'cause this takes less time ans space complexity...................
public class Transposem1 {
    static void Transposearr(int[][] arr, int r, int c) {
        System.out.println("The transposed matrix is:");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(arr[j][i] + " ");
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