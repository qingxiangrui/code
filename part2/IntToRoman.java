package part2;

import java.util.HashMap;
import java.util.Map;

/*
* 字符          数值
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。
C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。

*/
public class IntToRoman {
    private int[] keys;
    private String[] values;

    public IntToRoman() {
        keys = new int[]{1000,900,500,400,100,90,50,40,10,9,5,4,1};
        values = new String[]{"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    }

    public String intToRoman(int num) {
        String roman = "";
        for (int i = 0; i < keys.length; i++) {
            while (num >= keys[i]) {
                roman += values[i];
                num -= keys[i];
            }
        }
        return roman;
    }
}
