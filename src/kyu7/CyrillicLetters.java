package kyu7;

// Kata: Cyrillic letters
// https://www.codewars.com/kata/66d85e2db4d3909a8d0b53c9/java

public class CyrillicLetters {
    public static boolean isCyrillic(char letter) {
        int unicodeValue = (int) letter;
        if (unicodeValue >= 1024 && unicodeValue <= 1279) {
            return true;
        }
        return false;
    }
}
