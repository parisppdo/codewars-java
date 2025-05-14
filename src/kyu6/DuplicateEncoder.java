package kyu6;

import java.util.HashSet;
import java.util.ArrayList;

// Kata: Duplicate Encoder
// https://www.codewars.com/kata/54b42f9314d9229fd6000d9c/java

public class DuplicateEncoder {

    static boolean isDuplicate (String word, Character character) {
        HashSet<Character> letterSet = new HashSet<Character>();

        for (char c : word.toCharArray()) {
            if (letterSet.contains(character)) {
                if (c == character) {
                    return true;
                }
            }
            else {
                letterSet.add(c);
            }
        }
        return false;
    }

    public static String encode(String word){
        ArrayList<String> finalWord = new ArrayList<String>();
        word = word.toLowerCase();

        for (int i = 0; i < word.length(); i++) {
            if (isDuplicate(word, word.charAt(i))) {
                finalWord.add(")");
            }
            else {
                finalWord.add("(");
            }
        }

        StringBuilder sb = new StringBuilder();

        for (String s : finalWord) {
            sb.append(s);
        }

        return sb.toString();
    }

}