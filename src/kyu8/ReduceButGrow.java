package kyu8;

// Beginner - Reduce but Grow
// https://www.codewars.com/kata/57f780909f7e8e3183000078

public class ReduceButGrow {
    public static int grow(int[] x){
        int result = 1;
        for(int i = 0; i < x.length; i++){
            result *= x[i];
        }
        return result;
    }
}
