package part2;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    //方法1
//    private Map<String,Integer> map = new HashMap<>();
//
//
//    public RomanToInt() {
//        map.put("M",1000);
//        map.put("CM",900);
//        map.put("D",500);
//        map.put("CD",400);
//        map.put("C",100);
//        map.put("XC",90);
//        map.put("L",50);
//        map.put("XL",40);
//        map.put("X",10);
//        map.put("IX",9);
//        map.put("V",5);
//        map.put("IV",4);
//        map.put("I",1);
//    }
//
//
//    public int romanToInt(String s) {
//        int res = 0;
//        char[] chars = s.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            char curCh = chars[i];
//            if (i != chars.length - 1 && (curCh == 'I' || curCh == 'X' || curCh == 'C')) {
//                //!!!!!!!!!!!!!!!!!!!!!!!!
//                //!!!!!!!!!!!!!!!!!!!!!!
//                //空字符串的位置放在最开始，如果放在最后，得到的是数据字符串而不是想要的字符
//                String special = "" + curCh + chars[i + 1];
//                int curNum = map.getOrDefault(special,0);
//                if (curNum != 0) {
//                    res += curNum;
//                    i++;
//                    continue;
//                }
//            }
//            res += map.get(curCh + "");
//        }
//        return res;
//    }


    //方法2
    public int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<>(7);
        map.put('M',1000);
        map.put('D',500);
        map.put('C',100);
        map.put('L',50);
        map.put('X',10);
        map.put('V',5);
        map.put('I',1);

        char[] chars = s.toCharArray();
        int res = 0;
        for (int i = 0; i < chars.length; i++) {
            res += map.get(chars[i]);
            //!!!!!!!!!!!!!!!
            //!!!!!!!!!!!!!!!
            //!!!!!!!!!!!!!!!
            //大小的比较是根据数值的 不能按照字符  因为规定的字符不是按照英文自然顺序排的
            if (i != 0 && map.get(chars[i]) > map.get(chars[i - 1])) {
                res -= 2 * map.get(chars[i - 1]);
            }
        }
        return res;
    }
}
