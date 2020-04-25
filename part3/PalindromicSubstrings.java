package part3;

public class PalindromicSubstrings{

//方法1 递归  速度和空间都很垃圾
//    public int countSubstrings(String s) {
//        return recursiveCountPalindromicSubstrings(s,s.length() - 1);
//    }
//
//    private int recursiveCountPalindromicSubstrings(String s, int endIndex) {
//        int res = 0;
//
//        if (s == null || endIndex < 0) {
//            return res;
//        }
//
//        if (endIndex == 0) {
//            return 1;
//        }
//
//        int curCount = 0;
//        char lastChar = s.charAt(endIndex);
//        char[] chars = s.toCharArray();
//        for (int i = 0; i <= endIndex; i++) {
//            if (chars[i] == lastChar && isPalindromic(s,i,endIndex)) {
//                curCount++;
//            }
//        }
//        return recursiveCountPalindromicSubstrings(s,endIndex - 1) + curCount;
//    }
//
//    private boolean isPalindromic(String s, int low, int high) {
//        while (low <= high) {
//            if (s.charAt(low) != s.charAt(high)) {
//                return false;
//            }
//            low++;
//            high--;
//        }
//        return true;
//    }

//方法2 动态规划
    public int countSubstrings(String s) {
        //dp[i][j]表示i-j是否是回文字符串
        //dp[i][j] = dp[i+1][j-1] && s[i] == s[j]
        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        int res = 0;

        //init
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }
        res += len;

        //注意求的顺序，不能是固定i点，j点变动，因为这样的话求ij的时候需要知道i+1,j-1但是此时i+1这个点对应的还没求
        //但是如果固定长度假设长度为2 那么会依次挪动i  求到 12 23 34 45
        //长度为3的时候求到 123 234 345
        //这样求ij的时候  i+1,j-1肯定是知道的，因为i+1,j-1的距离更短，这和我们按照距离递增的顺序求解是对应的
        for (int l = 2; l <= len; l++) {
            for (int i = 0; i < len; i++) {
                int j = i + l - 1;
                if (j >= len) {
                    break;
                }
                if (j - i == 1) {
                    if (s.charAt(i) == s.charAt(j)) {
                        dp[i][j] = true;
                        res++;
                    } else {
                        dp[i][j] = false;
                    }
                } else {
                    dp[i][j] = dp[i + 1][j - 1] && s.charAt(i) == s.charAt(j);
                    if (dp[i][j]) {
                        res++;
                    }
                }
            }
        }

        return res;
    }

        public static void main(String[] args) {
            PalindromicSubstrings substrings = new PalindromicSubstrings();
            int aaa = substrings.countSubstrings("aaaaa");
            System.out.println(aaa);
        }
}
