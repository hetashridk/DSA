public class Largets_Subarray_with_sum_k {

    public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here
        long sum = a[0];
        int left = 0;
        int right = 0;
        int maxLen = 0;

        while(right < a.length){
            while(left <= right && sum > k){
                sum -= a[left];
                left++;
            }
            if(sum == k){
                maxLen = Math.max(maxLen, right - left + 1);
            }
            right++;
            if(right < a.length){
                sum += a[right];
            }
        }
        return maxLen;
    }
}
