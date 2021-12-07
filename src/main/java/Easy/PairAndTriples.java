package Easy;

public class PairAndTriples {
    public boolean solve(String s) {
        if ((s.length() - 2) % 3 != 0) {
            return false;
        }
        int[] occurrences = new int[10];
        for (int i = 0; i < s.length(); i++) {
            occurrences[s.charAt(i) - '0']++;
        }
        boolean pairFound = false;
        for (int occurrence : occurrences) {
            if (occurrence % 3 == 2) {
                if (pairFound) {
                    return false;
                }
                pairFound = true;
            } else if (occurrence % 3 != 0) {
                return false;
            }
        }
        return pairFound;
    }
}