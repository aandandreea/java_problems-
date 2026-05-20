/*Top K Frequent Elements

Given an integer array nums and an integer k, return the k most frequent elements within the array.

The test cases are generated such that the answer is always unique.

You may return the output in any order.*/

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            freq.put(nums[i],freq.getOrDefault(nums[i],0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a,b) -> freq.get(b) - freq.get(a)
        );

        for(int num : freq.keySet()){
            pq.add(num);
        }
        int[] result = new int[k];

        for(int i = 0; i < k; i++){
            result[i] = pq.poll();
        }
        return result;
    }
}
