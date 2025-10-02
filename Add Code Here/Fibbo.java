import java.util.ArrayList;
import java.util.Scanner;

public class Fibbo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("which element do you want to find");
        int x = sc.nextInt();
        System.out.println("Till which no. you want to print series");
        int a = sc.nextInt();
        int n1 = 0;
        int n2 = 1;
        int n3;
        ArrayList<Integer> fibboseries = new ArrayList<>();
        fibboseries.add(0);
        fibboseries.add(1);
        for (int i = 0; i < a - 1; i++) {
            n3 = n1 + n2;
            fibboseries.add(n3);
            n1 = n2;
            n2 = n3;
        }
        System.out.println("The element is");
        System.out.println(fibboseries.get(x));
        System.out.println("The whole series is:");
        System.out.println(fibboseries);
    }
}