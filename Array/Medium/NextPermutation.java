// codelink:- https://leetcode.com/problems/next-permutation/

public class NextPermutation {
    public void nextPermutation(int[] arr) {
        int index = -1;

        // step 1:- To find break point
        for(int i = arr.length - 2; i >= 0; i--){
            if(arr[i] < arr[i + 1]){
                index = i;
                break;
            }
        }

        if(index == -1){
            reverse(0, arr.length - 1, arr);
            return;
        }

        //step 2:-  To find the closest of arr[index]
        for(int i = arr.length - 1; i > index; i--){
            if(arr[index] < arr[i]){
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
                break;
            }
        }
        
        // step 3:- base case
        reverse(index + 1, arr.length - 1, arr);

    }
    public void reverse(int start, int end, int[] arr) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}

