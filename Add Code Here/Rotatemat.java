import java.util.Scanner;

public class Rotatemat {
    static void Rotatearr(int[][] arr, int r, int c) {
        int j = 0;
        System.out.println("90 degree rotated matrix is:");
        for (int i = 0; i < c; i++) {
            for (int k = r - 1; k >= 0; k--) {
                System.out.print(arr[k][j] + " ");
            }
            System.out.println();
            j++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Define the no. of rows");
        int r = sc.nextInt();
        System.out.println("Define the no. of columns");
        int c = sc.nextInt();
        System.out.println("Define elements for the array");
        int[][] arr = new int[r][c];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        Rotatearr(arr, r, c);
    }
}