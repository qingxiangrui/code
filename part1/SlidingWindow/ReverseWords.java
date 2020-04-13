package part1.SlidingWindow;

public class ReverseWords {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        String res = "";

        for (int i = words.length - 1; i >= 0; i--) {
            if (words.equals("")) continue;
            if (i != 0) {
                res += words[i] + " ";
            } else {
                res += words[i];
            }
        }
        return res;
    }
}
