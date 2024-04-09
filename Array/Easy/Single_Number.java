public class Single_Number {
    public int getSingle(int arr[], int n) {
        // code here
        int xor = 0;
       for(int i = 0; i < arr.length; i ++){
           xor = xor ^ arr[i];
       }

       return xor;
    }
}
