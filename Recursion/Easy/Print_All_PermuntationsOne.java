// package Recursion.Easy;

import java.util.ArrayList;

public class Print_All_PermuntationsOne {

    public static void helperFunction(int arr[], ArrayList<Integer> ds ,ArrayList<ArrayList<Integer>> ans, boolean[] vis){
        if(ds.size() == arr.length){
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i = 0; i < arr.length; i++){
            if(!vis[i]){
                vis[i] = true;
                ds.add(arr[i]);
                helperFunction(arr, ds, ans, vis);
                ds.remove(ds.size() - 1);
                vis[i] = false;
            }
        }
    }
    public static ArrayList<ArrayList<Integer>> generatePermutation(int arr[]){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> ds = new ArrayList<>();
        boolean vis[] = new boolean[arr.length];
        helperFunction(arr, ds, ans, vis);
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        ArrayList<ArrayList<Integer>> ans = generatePermutation(arr);

        for (ArrayList<Integer> arrayList : ans) {
            System.out.println(arrayList);
        }
        
    }
}
