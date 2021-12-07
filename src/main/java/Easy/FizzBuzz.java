package Easy;

public class FizzBuzz {
    public String[] solve(int n) {
        String[] strings = new String[n];
        for (int i = 1; i <= n; i++) {
            String toAdd = "";
            if (i % 3 == 0) {
                toAdd += "Fizz";
            }
            if (i % 5 == 0) {
                toAdd += "Buzz";
            }
            if (toAdd.equals("")) {
                toAdd = String.valueOf(i);
            }
            strings[i - 1] = toAdd;
        }
        return strings;
    }
}