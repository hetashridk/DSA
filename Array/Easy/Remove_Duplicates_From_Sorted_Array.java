public class Remove_Duplicates_From_Sorted_Array {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        for(int i = 0; i < nums.length; i++){
                if(nums[i] != nums[j - 1]){
                    nums[j] = nums[i];
                    j++;
                }
        }

        return j;
    }
}