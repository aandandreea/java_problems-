/*128. Longest Consecutive Sequence

Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.

*/


class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
           set.add(num);
        }
        int longest = 0;

        for(int num : set){
            if(!set.contains(num - 1)){
                int current = num;
                int count = 1;
            
                while(set.contains(current + 1)){
                    current++;
                    count++;
                }   
                longest = Math.max(longest, count);
            }   
        }
        return longest;
    }
}
