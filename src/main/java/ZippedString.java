public class ZippedString {
    public boolean solve(String a, String b, String c) {
        if (a.length() + b.length() != c.length()) {
            return false;
        }
        if (c.length() == 0) {
            return true;
        }
        boolean bool = false;
        if (a.length() > 0 && c.charAt(0) == a.charAt(0)) {
            bool = solve(a.substring(1), b, c.substring(1));
        }
        if (b.length() > 0 && c.charAt(0) == b.charAt(0)) {
            bool |= solve(a, b.substring(1), c.substring(1));
        }
        return bool;
    }
}