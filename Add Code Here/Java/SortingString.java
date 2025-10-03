import java.util.*;

public class SortingString {
    public static void main(String[] args) {// method 1 by converting string into char array..........
        String str = "vanshsoni";
        char[] arr = str.toCharArray();// convert the given string into char array
        Arrays.sort(arr);// use arrays.sort method to
        arr.toString();
        System.out.println(arr);
    }// method 2 by converting string's each character into ascii integer array and
     // sorting the integer array and converting it to string again...
}
