public class Kadanes_Algo {
    public int maxSubArray(int[] arr) {
        int sum = 0;
		int max = Integer.MIN_VALUE;

		for(int i = 0; i < arr.length; i++){
			sum += arr[i];

			if(sum > max){
				max = sum;
			}
			if(sum < 0){
				sum = 0;
			}
		}

		if(max < 0){
			return max;
		}

		return max;
    }
}
