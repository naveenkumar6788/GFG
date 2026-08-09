class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int max_sum=0;
        for(int i=0;i<k;i++){
            max_sum+=arr[i];
        }
        int window=max_sum;
        for(int i=k;i<arr.length;i++){
            window+=arr[i]-arr[i-k];
            max_sum=Math.max(max_sum,window);
        }
        return max_sum;
    }
}