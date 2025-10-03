import java.util.*;

public class reverseWord {
    public static void Reverse(StringBuilder str, int l, int r) {
        int j = r;
        while (l < j) {
            char ch1 = str.charAt(l);
            char ch2 = str.charAt(j);
            str.setCharAt(l, ch2);
            str.setCharAt(j, ch1);
            l++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        StringBuilder str = new StringBuilder(sc.nextLine());
        int l = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {// if current character is space then reverse from last lth idx to i-1 th idx
                                       // ...........
                Reverse(str, l, i - 1);
                l = i + 1;// update l as i+1 because we don't want space.........
            }
        }
        Reverse(str, l, str.length() - 1);
        System.out.println(str);
    }
}
