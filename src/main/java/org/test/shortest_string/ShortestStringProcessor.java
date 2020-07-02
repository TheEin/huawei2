package org.test.shortest_string;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ShortestStringProcessor {

    public String process(CharSequence input) {
        Map<Character, Integer> letters = new HashMap<>();
        TreeMap<Integer, Character> sortedLetters = new TreeMap<>();
        for (int i = input.length() - 1; i >= 0; --i) {
            char c = input.charAt(i);
            Integer p = letters.get(c);
            if (p == null) {
                letters.put(c, i);
                sortedLetters.put(i, c);
            } else {
                Map.Entry<Integer, Character> e = sortedLetters.firstEntry();
                if (e.getValue() > c) {
                    letters.put(c, i);
                    sortedLetters.remove(p, c);
                    sortedLetters.put(i, c);
                }
            }
        }
        StringBuilder s = new StringBuilder(letters.size());
        for (Character c : sortedLetters.values()) {
            s.append(c);
        }
        return s.toString();
    }
}
