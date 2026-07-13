class Solution {
    int majorityElement(int arr[]) {
        // code here
        int c=1;
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                c++;
            }
            else{
                c=1;
            }
            if(arr.length/2<c){
            return arr[i];
            }
        }
        if(arr.length==1){
            return arr[0];
        }
        
        return -1;
    }
}