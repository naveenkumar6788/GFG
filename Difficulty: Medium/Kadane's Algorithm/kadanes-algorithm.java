class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int maxarr = arr[0];
        int currMax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            currMax = Math.max(arr[i], currMax + arr[i]);
            maxarr= Math.max(maxarr, currMax);
        }
        return maxarr;
    }
}
