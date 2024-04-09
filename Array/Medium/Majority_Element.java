import java.util.HashMap;

public class Majority_Element {
    public static int majorityElement(int v[], int size) {
        // your code her
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < v.length; i++) {
            int num = v[i];
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        int k = 0;
        for (Integer key : map.keySet()) {

            if (map.get(key) > v.length / 2) {
                return key;
            }
        }

        return -1;
    }
}
