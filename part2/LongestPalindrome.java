package part2;

import java.util.HashSet;
import java.util.Set;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        Set<Character> set = new HashSet<>();
        int count = 0;

        char[] chars = s.toCharArray();
        for (char ch : chars) {
            if (!set.add(ch)) {
                count += 2;
                set.remove(ch);
            }
        }

        if (s.length() > count) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
//        String s = "abccccdd";
        String s = "cabb";
        LongestPalindrome palindrome = new LongestPalindrome();
        int i = palindrome.longestPalindrome(s);
        System.out.println(i);
    }
}
