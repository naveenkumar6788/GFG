class Solution {
    public int kthSmallest(int[] arr, int k) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(i+1==k){
                return arr[i];
            }
        }
        return -1;
    }
}
