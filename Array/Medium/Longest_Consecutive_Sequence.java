// codelink:- https://leetcode.com/problems/longest-consecutive-sequence/

public class Longest_Consecutive_Sequence {
    public int longestConsecutive(int[] nums) {

        // base case
        if(nums.length == 0){
            return 0;
        }

        //sort the array
        Arrays.sort(nums);

        int currCount = 0;
        int longest = 1;
        int lastSmaller = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] - 1 == lastSmaller){
                currCount++;
                lastSmaller = nums[i];
            }
            else if(nums[i] != lastSmaller){
                currCount = 1;
                lastSmaller = nums[i];
            }
            longest = Math.max(longest, currCount);
        }

        return longest;
    }
}
