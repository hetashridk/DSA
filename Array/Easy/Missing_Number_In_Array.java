public class Missing_Number_In_Array {
    public int missingNumber(int array[], int n) {
        // Your Code Here
        int sum = n * (n + 1) / 2;
        int s = 0;
        
        for(int i = 0; i < n - 1; i++){
            s += array[i];
        }
        
        return sum - s;
    }
}
