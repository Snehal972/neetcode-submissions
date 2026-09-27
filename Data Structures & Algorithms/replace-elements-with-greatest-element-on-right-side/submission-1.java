// class Solution {
//     public int[] replaceElements(int[] arr) {
//         int[] ans = new int[arr.length];
//         for(int i = 0; i < arr.length; i++) {
//             int rightMax = -1;
//             for(int j = i + 1; j < arr.length; j++) {
//                 rightMax = Math.max(rightMax, arr[j]);
//             }
//                 ans[i] = rightMax;
//         }
//         return ans;
//     }
// }

public class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int rightMax = -1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] = rightMax;
            rightMax = Math.max(rightMax, arr[i]);
        }
        return ans;
    }
}