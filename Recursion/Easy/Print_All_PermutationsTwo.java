package Recursion.Easy;

import java.util.ArrayList;

public class Print_All_PermutationsTwo {
    public static void permutations(int index, int arr[], ArrayList<ArrayList<Integer>> ans){
        if(index == arr.length){
            ArrayList<Integer> ds = new ArrayList<>();
            for(int i = 0; i < arr.length; i++){
                ds.add(arr[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i = index; i < arr.length; i++){
            swap(i, index, arr);
            permutations(index + 1, arr, ans);
            swap(i, index, arr);
        }
    }
    public static void swap(int i, int j, int arr[]){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        
    }
}
