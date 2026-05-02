package kyu6;

// Kata: Magic Music Box
// https://www.codewars.com/kata/6710e54f8ef071fe99eebd07

import java.util.*;
import java.util.List;


public class MagicMusicBox {
    public static String[] magicMusicBox(String[] words) {
        String[] notes = {"DO", "RE", "MI", "FA", "SOL", "LA", "SI"};
        List<String> result = new ArrayList<>();
        Set<String> mentioned = new HashSet<>();

        int notesIndex = 0;
        int wordIndex = 0;

        while (true) {
            String currentNote = notes[notesIndex % notes.length];
            boolean found = false;

            for (int i = wordIndex; i < words.length; i++) {
                wordIndex++;
                String word = words[i];
                if (mentioned.contains(word)) {
                    continue;
                }

                if (word.contains(currentNote)) {
                    result.add(word);
                    mentioned.add(word);
                    notesIndex++;
                    found = true;
                    break;
                }
            }

            if (wordIndex >= (words.length)) {
                List<String> checkWords = new ArrayList<>(Arrays.asList(words));
                checkWords.removeAll(result);
                for (String checkWord : checkWords) {
                    if (checkWord.contains(currentNote)) {
                        found = true;
                        break;
                    }
                }
            }

            if (wordIndex >= (words.length)) {
                wordIndex = 0;
            }

            if (found == false) {
                break;
            }
        }

        return result.toArray(new String[0]);
    }
}
