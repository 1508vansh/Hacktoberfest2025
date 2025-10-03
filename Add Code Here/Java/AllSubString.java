import java.util.ArrayList;

public class AllSubString {
    public static void main(String[] args) {
        String str = "abc";
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                arr.add(str.substring(i, j));
            }
        }
        System.out.println(arr);
    }
}