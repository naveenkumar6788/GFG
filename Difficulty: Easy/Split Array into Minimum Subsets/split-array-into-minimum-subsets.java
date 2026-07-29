class Solution {
    int minSubsets(int arr[]) {
        Arrays.sort(arr);
        // code here
        int c=1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]!=1){
                c++;
            }
        }
        return c;
        
    }
}