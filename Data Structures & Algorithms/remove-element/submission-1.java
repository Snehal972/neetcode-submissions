// class Solution {
//     public int removeElement(int[] nums, int val) {
//         int k = 0;
//         int n = nums.length;
//         for(int i = 0; i < n; i++) {
//                 if (nums[i] != val) {
//                     nums[k++] = nums[i];
//                 }
//             }
//         return k;
//     }
// }

public class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0, n = nums.length;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[--n];
            } else {
                i++;
            }
        }
        return n;
    }
}