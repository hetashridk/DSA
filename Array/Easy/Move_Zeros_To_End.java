import java.util.Arrays;

public class Move_Zeros_To_End {
    public static int[] moveZero(int a[], int n){
        int j = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(a[i] == 0){
                j = i;
                break;
            }
        }

        if(j == Integer.MIN_VALUE){
            return a;
        }

        for(int i = j + 1;  i < n; i++){
            if(a[i] != 0){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }
        }

        return a;0
    }

}
