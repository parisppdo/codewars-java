package kyu8;

// Find the smallest integer in the array
// https://www.codewars.com/kata/55a2d7ebe362935a210000b2

public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        int smallest = args[0];
        for (int i = 1; i < args.length; i++) {
            if (args[i] < smallest) {
                smallest = args[i];
            }
        }
        return smallest;
    }
}