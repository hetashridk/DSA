// problem link:- https://leetcode.com/problems/subarray-sum-equals-k/

public class SubArray_Sum_Equal_k {
    public int subarraySum(int[] nums, int k) {

        int count = 0;
        int presum = 0;

                //presum, count
        HashMap<Integer, Integer> map = new HashMap<>();

        // first store (0, 1) in hashmap;
        map.put(0, 1);

        for(int i = 0; i < nums.length; i++){
            presum += nums[i];

            int remove = presum - k;
            count += map.getOrDefault(remove, 0);

            // Update the count of prefix sum
            // in the map.
            map.put(presum, map.getOrDefault(presum, 0) + 1);
        }

        return count;
    }
}
