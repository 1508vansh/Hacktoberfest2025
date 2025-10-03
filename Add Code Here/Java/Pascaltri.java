import java.util.Scanner;

public class Pascaltri {
    static void Pascaltri(int r) {
        int[][] arr = new int[r][];
        for (int i = 0; i < r; i++) {
            arr[i] = new int[i + 1];
            arr[i][0] = arr[i][i] = 1;
            for (int j = 1; j < i; j++) {
                arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
            }
        }
        Printarr(arr);
    }

    static void Printarr(int[][] arr) {
        System.out.println("Here is your pascal's triangle:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Define the number of rows for pascal's triangle");
        int r = sc.nextInt();
        Pascaltri(r);
    }
}