class Solution {
    public int majorityElement(int[] nums) {
        // Arrays.sort(nums);
        // return nums[nums.length / 2];

        HashMap<Integer, Integer> count = new HashMap<>();
        int res = 0;
        int maxCount = 0;

        for(int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
            if(count.get(num) > maxCount) {
                res = num;
                maxCount = count.get(num);
            }
        }
        return res;
    }
}