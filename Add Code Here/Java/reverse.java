import java.util.*;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        int l = 0;
        int r = str.length() - 1;
        while (l < r) {
            char ch1 = str.charAt(l);
            char ch2 = str.charAt(r);
            str.setCharAt(l, ch2);
            str.setCharAt(r, ch1);
            l++;
            r--;
        }
        System.out.println(str);
        // or simply use inbuilt function that is str.reverse();
    }
}
