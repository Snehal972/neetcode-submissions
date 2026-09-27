class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
        for(int i =0; i < nums.length; i++){
            hash.add(nums[i]);
        }
        if(hash.size() == nums.length) return false;
        return true;
    }
}