// codelink:- https://www.naukri.com/code360/problems/superior-elements_6783446?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

public class Leader_In_An_Array {
    public static List< Integer > superiorElements(int []a) {
        // Write your code here.

        int maxi = a[a.length - 1];
        List<Integer> sorted = new ArrayList<>();
        sorted.add(maxi);

        for(int i = a.length - 2; i >= 0; i--){
            if(a[i] > maxi){
                maxi = a[i];
                sorted.add(maxi);
            }
        }

        Collections.sort(sorted);

        return sorted;


    }
}
