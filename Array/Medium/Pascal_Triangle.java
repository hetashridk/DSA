// Problem Link:- https://leetcode.com/problems/pascals-triangle-ii/description/

import java.util.ArrayList;

public class Pascal_Triangle {
    public ArrayList<Integer> getRow(int rowIndex) {
        ArrayList<Integer> res = new ArrayList<>();
        res.add(1);

        for(int i = 1; i <= rowIndex; i++) {
            long val = (long) res.get(i - 1) * (rowIndex - i + 1) / i;
            res.add((int) val);
        }

        return res;
    }
}
