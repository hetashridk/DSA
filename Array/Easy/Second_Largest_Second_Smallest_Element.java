// less optimal solution
public class Second_Largest_Second_Smallest_Element {
    public static int[] getSecondOrderElements(int n, int []a) {
 
        int largest = a[0];

        for(int i = 1; i < n; i++){
            if(largest < a[i]){
                largest = a[i];
            }
        }

        int smallest = a[0];

        for(int i = 1; i < n; i++){
            if(smallest > a[i]){
                smallest = a[i];
            }
        }

        int slargest = Integer.MIN_VALUE;
        int ssmallest = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            if(slargest < a[i] && a[i] != largest){
                slargest = a[i];
            }
        }
        for(int i = 0; i < n; i++){
            if(ssmallest > a[i] && a[i] != smallest){
                ssmallest = a[i];
            }
        }

        int arr[] =new int[2];

        arr[0] = slargest;
        arr[1] = ssmallest;

        return arr;

    }
}


// optimal approach
public class Second_Largest_Second_Smallest_Element {
    public static int secondLargest(int a[], int n){
        int largest = a[0];
        int slargest = Integer.MIN_VALUE;

        for(int i = 1; i < n; i++){
            if(largest < a[i]){
                slargest = largest;
                largest = a[i];
            }
            else if(largest > a[i] && slargest < a[i]){
                slargest = a[i];
            }
        }

        return slargest;
    }
    public static int secondSmallest(int a[], int n){
        int smallest = a[0];
        int ssmallest = Integer.MAX_VALUE;

        for(int i = 1; i < n; i++){
            if(smallest > a[i]){
                ssmallest = smallest;
                smallest = a[i];
            }
            else if(smallest < a[i] && ssmallest > a[i]){
                ssmallest = a[i];
            }
        }

        return ssmallest;
    }
    public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.
        int slargest = secondLargest(a, n);
        int ssmallest = secondSmallest(a, n);

        int arr[] = new int[2];
        arr[0] = slargest;
        arr[1] = ssmallest;
        return arr;
    }
}