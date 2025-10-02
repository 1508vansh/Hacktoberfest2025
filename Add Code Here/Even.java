import java.util.*;

public class Even {
    public static int Sumofn(int n) {
        int sum = 0;
        int count = 0;
        for (int i = 1; count < n; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
                count++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int vansh = Sumofn(n);
        System.out.println(vansh);
    }
}
// sum of first n even numbers...........