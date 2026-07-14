class Solution {
    public int missingNumber(int[] arr) {
        Arrays.sort(arr);
        int expected=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=0){
                continue;
            }
            else if(arr[i]==expected){
                expected++;
            }
            else if(arr[i]>expected){
                return expected;
            }
        }
        
        return expected;
    }
}
