import java.util.*;

class Solution {
    static int cal(int[] arr, int i, int j, int[][] dp) {
        if (i + 1 >= j)
            return 0;
        if (dp[i][j] != -1)
            return dp[i][j];
        int minCost = Integer.MAX_VALUE;
        for (int k = i + 1; k < j; k++) {
            int x = arr[i] * arr[k] * arr[j];
            int currCost = cal(arr, i, k, dp) + cal(arr, k, j, dp) + x;
            minCost = Math.min(minCost, currCost);
        }
        return dp[i][j] = minCost;
    }

    static int matrixMultiplication(int arr[]) {
        int[][] dp = new int[arr.length][arr.length];
        for (int[] d : dp)
            Arrays.fill(d, -1);
        return cal(arr, 0, arr.length - 1, dp);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 3, 4 };// Expected output : 20
        int ans = matrixMultiplication(arr);
        System.out.println(ans);
    }
}