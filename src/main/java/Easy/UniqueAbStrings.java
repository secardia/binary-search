package Easy;

public class UniqueAbStrings {
    public int solve(String s) {
        int nbA = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                nbA++;
            }
        }
        return (int) Math.pow(2, nbA);
    }
}