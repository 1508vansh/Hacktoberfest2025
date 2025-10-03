import java.util.Scanner;

public class Toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string......");
        StringBuilder sb = new StringBuilder(sc.nextLine());// take input..........
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) >= 97 && sb.charAt(i) <= 122) {// if ascii ranges form a - z;
                int x = sb.charAt(i);
                x -= 32;// reduce 32 to get uppercase value......
                sb.setCharAt(i, (char) x);// set char......
            } else if (sb.charAt(i) >= 65 && sb.charAt(i) <= 90) {// if ascii ranges from A-Z;
                int x = sb.charAt(i);
                char ch = (char) ((char) x + 32);// add 32 to get lowercase value......
                sb.setCharAt(i, ch);// set char......
            }
        }
        System.out.println(sb);
    }
}
