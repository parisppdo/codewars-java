package kyu8;

// Kata: Count by X
// https://www.codewars.com/kata/5513795bd3fafb56c200049e

import java.util.ArrayList;

public class CountByX {
    public static int[] countBy(int x, int n){
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            int multiple = i * x;
            resultList.add(multiple);
        }

        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }
}
