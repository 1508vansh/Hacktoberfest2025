public class OccerMost {
    public static void main(String[] args) {// print the character that occer most of the time...........
        String str = "aaabbababcccb";
        int[] arr = new int[26];
        for (int i = 0; i < str.length(); i++) {
            int x = (int) str.charAt(i);
            arr[x - 97]++;
        }
        int max = 0;
        // int x = -1;
        for (int i = 0; i <= 25; i++) {
            if (max < arr[i]) {
                max = arr[i];
                // x = i + 97;
            }
        }
        for (int i = 0; i <= 25; i++)
            if (arr[i] == max) {
                System.out.print((char) (i + 97) + " ");
            }
    }
}
