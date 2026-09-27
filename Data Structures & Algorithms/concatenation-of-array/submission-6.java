class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] arr = new int [2 * nums.length];
        int j=0;
        for(int i = 0; i < nums.length;i++){
            arr[j++] = nums[i]; 
        }
        for(int i = 0; i < nums.length;i++){
            arr[j++] = nums[i]; 
        }
        return arr;
    
//         int n = nums.length;
//         int i=0;
//         while(j<2*n){
//             if(i==n) {
//                i-=n;
//             }
//             arr[j++] = nums[i++]; 
//         }
//    return arr;

        
    }
}