class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
         int n = arr.length;
        if (n < k) return -1;
        int windowsum=0;
        for(int i=0;i<k;i++){
            windowsum+=arr[i];
        }
        int maxsum=windowsum;
        for(int i=k;i<n;i++){
            windowsum+=arr[i]-arr[i-k];
             maxsum=Math.max(maxsum,windowsum);
        }
        return maxsum;
        
    }
}