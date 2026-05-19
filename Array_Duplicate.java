/*Contains Duplicate

Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.*/

class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int i : nums){
            set.add(i);
        }
        if(set.size() != nums.length){
            return true;
        }
        return false;
    }
}
