package kyu8;

// Kata: Cyrillic letters
// https://www.codewars.com/kata/66d85e2db4d3909a8d0b53c9/java

public class Quarter {
    public static int quarterOf(int month) {
        int[] first = {1,2,3};
        int[] second = {4,5,6};
        int[] third = {7,8,9};
        int[] fourth = {10,11,12};

        for(int i : first){
            if(i == month){
                return 1;
            }
        }for(int i : second){
            if(i == month){
                return 2;
            }
        }
        for(int i : third){
            if(i == month){
                return 3;
            }
        }
        for(int i : fourth){
            if(i == month){
                return 4;
            }
        }
        return 0;
    }
}
