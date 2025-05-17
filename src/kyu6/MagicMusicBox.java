package kyu6;

// Kata: Magic Music Box
// https://www.codewars.com/kata/6710e54f8ef071fe99eebd07

import java.util.*;

public class MagicMusicBox {
    public static String[] magicMusicBox(String[] words) {
        String[] notes = {"DO", "RE", "MI", "FA", "SOL", "LA", "SI"};
        List<String> result = new ArrayList<>();
        Set<String> mentioned = new HashSet<>();

        int notesIndex = 0;

        while (true) {
            String currentNote = notes[notesIndex % notes.length];
            boolean found = false;

            for (String word : words) {
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
            if (found == false) {
                break;
            }
        }

        return result.toArray(new String[0]);
    }
}
