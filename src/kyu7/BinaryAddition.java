package kyu7;

// Kata: Binary Addition
// http://codewars.com/kata/551f37452ff852b7bd000139

import java.util.ArrayList;

public class BinaryAddition {
    public static String binaryAddition(int a, int b){
        int decimalSum = a + b;
        String binarySum = Integer.toBinaryString(decimalSum);
        return binarySum;
    }
}
