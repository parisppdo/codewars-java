package kyu6;

// Kata: Stop gninnipS My sdroW!
// https://www.codewars.com/kata/5264d2b162488dc400000001/java

public class SpinWords {
    public static String spinWords(String sentence) {
        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= 5) {
                String reversed = "";
                char ch;

                for (int j = 0; j < words[i].length(); j++) {
                    ch = words[i].charAt(j);
                    reversed = ch + reversed;
                }
                words[i] = reversed;
            }
        }

        return String.join(" ", words);
    }
}
