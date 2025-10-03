public class Sort01and2 {
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 0, 1, 1, 1, 2, 0, 2, 0, 1, 0, 2, 1, 1, 2, 0 };
        int low = 0;
        int mid = 0;
        int hi = arr.length - 1;
        while (mid < hi) {
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, hi);
                hi--;
            }
        }
        for (int i : arr)
            System.out.print(i + " ");
    }
}
