public class DecodeMessage {
    public int solve(String message) {
        if (message.length() == 0) {
            return 1;
        }
        int nbDecode = 0;
        if (message.charAt(0) != '0') {
            nbDecode += solve(message.substring(1));
            if (message.length() >= 2 && message.substring(0, 2).compareTo("26") <= 0) {
                nbDecode += solve(message.substring(2));
            }
        }
        return nbDecode;
    }
}