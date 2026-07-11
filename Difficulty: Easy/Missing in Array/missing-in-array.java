class Solution {
    int missingNum(int arr[]) {
        int n = arr.length + 1;
        long sum = (long) n * (n + 1) / 2;
        long tsum = 0;
        for (int num : arr) {
            tsum += num;
        }
        return (int)(sum - tsum);
    }
}