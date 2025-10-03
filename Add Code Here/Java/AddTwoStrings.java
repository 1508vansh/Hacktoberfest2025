public class AddTwoStrings {
    public static String addStrings(String num1, String num2) {
        StringBuilder ans = new StringBuilder();
        int mod = 0;
        int carry = 0;
        int sum = 0;
        int l1 = num1.length();
        int l2 = num2.length();
        int i = l1 - 1;
        int j = l2 - 1;
        while (i >= 0 && j >= 0) {
            sum = num1.charAt(i) - '0' + num2.charAt(j) - '0' + carry;
            ans.append(sum % 10);
            carry = sum / 10;
            i--;
            j--;
        }
        while (i >= 0) {
            sum = num1.charAt(i) - '0' + carry;
            ans.append(sum % 10);
            carry = sum / 10;
            i--;
        }
        while (j >= 0) {
            sum = num2.charAt(j) - '0' + carry;
            ans.append(sum % 10);
            carry = sum / 10;
            j--;
        }
        if (carry != 0) {
            ans.append(carry);
        }
        i = 0;
        j = ans.length() - 1;
        while (i < j) {
            char ch1 = ans.charAt(i);
            char ch2 = ans.charAt(j);
            ans.setCharAt(i, ch2);
            ans.setCharAt(j, ch1);
            i++;
            j--;
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String num1 = "1241";
        String num2 = "20";
        System.out.println(addStrings(num1, num2));
    }
}
