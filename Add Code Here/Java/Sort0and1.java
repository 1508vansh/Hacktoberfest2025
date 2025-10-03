public class Sort0and1 {
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1, 0, 1, 0 };
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            if (arr[l] == 1 && arr[r] == 0) {
                swap(arr, l, r);
            }
            if (arr[l] == 0)
                l++;
            else
                r--;
        }
        for (int e : arr)
            System.out.print(e + " ");
    }
}
