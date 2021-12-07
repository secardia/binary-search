package Medium;

import java.util.HashMap;
import java.util.Map;

public class PalindromicAnagram {
    public boolean solve(String s) {
        Map<Character, Integer> charToOccurrenceNb = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            charToOccurrenceNb.putIfAbsent(c, 0);
            charToOccurrenceNb.computeIfPresent(c, (k, v) -> v = v + 1);
        }
        int nbOddOccurrenceNb = 0;
        for (int occurrenceNb : charToOccurrenceNb.values()) {
            if (occurrenceNb % 2 == 1) {
                if (nbOddOccurrenceNb == 1) {
                    return false;
                }
                nbOddOccurrenceNb++;
            }
        }
        return true;
    }
}