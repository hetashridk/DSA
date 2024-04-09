import java.util.Arrays;

public class Rotate_Array {
    public static int[] rotate(int[] arr, int k){
        for(int i = 0; i < k; i++){
            int temp = arr[0];
            for(int j = 1; j < arr.length; j++){
                arr[j - 1] = arr[j];
            }
            arr[arr.length - 1] = temp;
        }
        return arr;
    }
    public static int[] rotateLeft(int[] arr, int k){
        for(int i = 0; i < k; i++){
            int temp = arr[arr.length - 1];
            for(int j = arr.length - 1; j > 0; j--){
                arr[j] = arr[j - 1];
            }
            arr[0] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        rotateLeft(arr, 3);
        System.out.println(Arrays.toString(arr));
    }
}
