public class Setbit {
    public static void main(String[] args) {
        int a = 753;
        int b = 4;
        // this will (bitresult) give us 0010 and then it will
        // convert it to binary form that is 2;
        int ans = (((753 >> 3) >> 2) << 1);
        // NOW THE BINARY OF '2' WILL MAKE 'OR' CONDITION WITH THE 'a' AND,
        // THE 'a' IS 5 WHOSE BINARY IS 0101 , SO BINARY OF 2 AND 5 WILL GIVE
        // CONDITION AND RETURN '0111' WHICH IS 7 IN DECIMAL.
        System.out.println(ans);

    }

}
