public class Checked_Sorted_Array {
    public static boolean isSorted(int n, int []a) {
        for(int i = 1; i < n; i++){
            if(a[i] >= a[i - 1]){
                
            }
            else{
                return false;
            }
        }
        return true;
    }
}
