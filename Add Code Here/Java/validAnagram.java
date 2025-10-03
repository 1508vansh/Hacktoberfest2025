import java.util.*;

public class validAnagram {
    public static boolean CheckAnagram(String s, String t) {// Another method than hashmap to check whether two Strings
                                                            // are anagram of not....
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        s = new String(arr1);
        t = new String(arr2);
        return s.equals(t);
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        boolean ans = CheckAnagram(s, t);
        System.out.println(ans);
    }
}
