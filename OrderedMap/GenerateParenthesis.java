package OrderedMap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenerateParenthesis {
//    public List<String> generateParenthesis(int n) {
//        Set<String> res = new HashSet<>();
//        List<String> resList = new ArrayList<>();
//        int leftHalf = n;
//
//        for (int i = leftHalf; i >= 1; i--) {
//            Set<String> set = new HashSet<>();
//            if (i == leftHalf) {
//                // 最简单的情况
//                res.add(generateLeftPart(i,-1) + generateLeftPart(i,1));
//            } else {
//                // i个左括号 leftHalf - i个右括号
//                // 生成左边部分
//                String leftPart = generateLeftPart(i,-1);
//                set.add(leftPart);
//                set = dealRightSection(i, 0, n * 2, set);
//                res.addAll(set);
//            }
//        }
//        resList.addAll(res);
//        return resList;
//    }
//
//    private String generateLeftPart(int len,int pos) {
//        StringBuilder sb = new StringBuilder();
//        if (pos == -1) {
//            for (int i = 0; i < len; i++) {
//                sb.append("(");
//            }
//        }
//
//        if (pos == 1) {
//            for (int i = 0; i < len; i++) {
//                sb.append(")");
//            }
//        }
//        return sb.toString();
//    }
//
//    private Set<String> dealRightSection(int l, int r, int len, Set<String> set) {
//        int rightToDeal = len - (l + r);
//        if (rightToDeal == 0) return set;
//
//        //判断左边状态
//        int status = l - r;
//        if (status <= 0) {
//            //() / (()) /  ())不可能
//            // 只能添加左括号
//            Set<String> temp = new HashSet<>(set.size());
//            for (String str : set) {
//                temp.add(str + "(");
//            }
//            return dealRightSection(l + 1,r, len, temp);
//        } else {
//            // (()
//            // 可以左括号  如果当前状态加上左括号后
//            Set<String> temp1 = new HashSet<>(set.size());
//            if (status != rightToDeal) {
//                for (String str : set) {
//                    temp1.add(str + "(");
//                }
//            }
//
//            Set<String>  leftCondition = dealRightSection(l + 1, r, len, temp1);
//            // 可以右括号
//            Set<String> temp2 = new HashSet<>(set.size());
//            for (String str : set) {
//                temp2.add(str + ")");
//            }
//            Set<String> rightCondition = dealRightSection(l, r + 1, len, temp2);
//            leftCondition.addAll(rightCondition);
//            return leftCondition;
//        }
//    }

    public List<String> generateParenthesis(int n) {
        if (n == 0) return new ArrayList<>();

       //动态规划
        List<ArrayList<String>> lists = new ArrayList<ArrayList<String>>();

        ArrayList<String> list0 = new ArrayList<>();
        list0.add("");
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("()");
        lists.add(list0);
        lists.add(list1);

        for (int i = 2; i <= n; i++) {
            ArrayList<String> listi = new ArrayList<>();
            for (int j = 0; j <= i - 1; j++) {
                ArrayList<String> subList1 = lists.get(j);
                ArrayList<String> subList2 = lists.get(i - 1 - j);
                for (String s1 : subList1) {
                    for (String s2 : subList2) {
                        listi.add("(" + s1 + ")" + s2);
                    }
                }
            }
            lists.add(listi);
        }
        return lists.get(n);
    }
}
