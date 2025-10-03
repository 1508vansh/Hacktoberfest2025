public class StringCompressionm1 {
    public static int compress(char[] chars) {// look at the leetcode..................
        int n = chars.length;
        if (n == 1)
            return 1;
        int t1 = 0;// left
        int t2 = 1;// right
        int count;// took count variable to store the frequency of a particular element.....
        int idx = -1;// initially took idx as -1 to store the elements.....
        while (t2 < n) {// while t2 is less than the size of the chars array......
            count = 1;
            while (t2 < n && chars[t1] == chars[t2]) {// jab tak t2 size se chotta h and also t1th idx ka element t2th
                                                      // idx ke same h..
                count++;
                t2++;// aage badho.....
            }
            if (t2 == n) {// agar t2 size ke barabar h.......i.e t2==n
                chars[++idx] = chars[t1];
                if (count == 1) {// if there is no duplicate of current element....
                    break;
                } else if (count >= 10) {// if count is 10 or greater then spit its character into following parts and
                                         // store it in the chars array.
                    StringBuilder str = new StringBuilder();
                    str.append(count);// to take count as string....
                    for (int i = 0; i < str.length(); i++) {
                        chars[++idx] = str.charAt(i);// store the divided count's characters
                    }
                } else {// if there are duplicates && count is less than 10 && t2 is less than equals to
                        // n ......(t2<=n)
                    String c = Integer.toString(count);// to convert the count to character
                    chars[++idx] = c.charAt(0);// first converted to string and then converted to character.....
                }
                break;// break because t2 == n;
            }
            if (count == 1) {// if there are no duplicates of the current element.......
                chars[++idx] = chars[t1];// store as it is without storing the frequency......
            } else if (count >= 10) {// if count is greater than 10 in normal case......
                chars[++idx] = chars[t1];
                StringBuilder str = new StringBuilder();
                str.append(count);
                for (int i = 0; i < str.length(); i++) {// split the character of count and store...
                    chars[++idx] = str.charAt(i);
                }
            } else {
                chars[++idx] = chars[t1];// if count is less than 10 then kindily store it with frequency......
                String c = Integer.toString(count);
                chars[++idx] = c.charAt(0);
            }
            if (t2 == n - 1 && chars[t1] != chars[t2]) {// agar t2 last idx par h and there are no duplicates , means
                                                        // curr elem is not equals to prev element
                chars[++idx] = chars[t2];// then store the last one element also.........because till now we have been
                                         // storing t1 only....
            }
            t1 = t2;// update t1 as t2......
            t2 = t2 + 1;// update t2 by one...........
        }
        return idx + 1;// return the size of the answer..........
    }

    public static void main(String[] args) {
        char[] chars = { 'a', 'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'c', 'c', 'c' };
        int ans = compress(chars);// {'a','2','b','1','2','c','3'}
        System.out.println(ans);
    }
}
