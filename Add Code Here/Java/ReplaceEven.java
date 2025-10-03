public class ReplaceEven {
    public static void main(String[] args) {
        String str = "Raghav";
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                ans += 'a';
            } else {
                ans += str.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
