package part3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 1.整数（一轮的得分）：直接表示您在本轮中获得的积分数。
 2. "+"（一轮的得分）：表示本轮获得的得分是前两轮有效 回合得分的总和。
 3. "D"（一轮的得分）：表示本轮获得的得分是前一轮有效 回合得分的两倍。
 4. "C"（一个操作，这不是一个回合的分数）：表示您获得的最后一个有效 回合的分数是无效的，应该被移除。

 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/baseball-game
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class BaseballGame {
    public int calPoints(String[] ops) {
        int sum = 0;
        List<Integer> nums = new ArrayList<>();

        for (String op : ops) {
            int curNum = 0;
            switch (op) {
                case "+":
                    int len = nums.size();
                    curNum = nums.get(len - 2) + nums.get(len - 1);
                    nums.add(curNum);
                    sum += curNum;
                    break;
                case "D":
                    curNum = nums.get(nums.size() - 1) * 2;
                    nums.add(curNum);
                    sum += curNum;
                    break;
                case "C":
                    int remove = nums.remove(nums.size() - 1);
                    sum -= remove;
                    break;
                default:
                    curNum = Integer.parseInt(op);
                   nums.add(curNum);
                   sum += curNum;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        BaseballGame game = new BaseballGame();
        game.calPoints(new String[]{"8373","C","9034","-17523","D","1492","7558",
                "-5022","C","C","+","+","-16000","C","+","-18694",
                "C","C","C","-19377","D","-25250","20356","C","-1769",
        "-8303","C","-25332","29884","C","+","C","-29875","-15374",
        "C","+","14584","13773","+","17037","-28248","+","16822","D",
        "+","+","-19357","-26593","-8548","4776","D","-8244","378","+",
        "-19269","-25447","18922","-16782","2886","C","-17788","D","-22256",
        "C","308","-9185","-19074","1528","28424","D","8658","C","7221","-13704",
        "8995","-21650","22567","-29560","D","-9807","25632","6817","28654","D","-18574",
        "C","D","20103","7875","C","9911","23951","C","D","C","+","18219","-20922","D","-24923"});

        /*
        * ["8373","C","9034","-17523","D","1492","7558",
        * "-5022","C","C","+","+","-16000","C","+","-18694",
        * "C","C","C","-19377","D","-25250","20356","C","-1769",
        * "-8303","C","-25332","29884","C","+","C","-29875","-15374",
        * "C","+","14584","13773","+","17037","-28248","+","16822","D",
        * "+","+","-19357","-26593","-8548","4776","D","-8244","378","+",
        * "-19269","-25447","18922","-16782","2886","C","-17788","D","-22256",
        * "C","308","-9185","-19074","1528","28424","D","8658","C","7221","-13704",
        * "8995","-21650","22567","-29560","D","-9807","25632","6817","28654","D","-18574",
        * "C","D","20103","7875","C","9911","23951","C","D","C","+","18219","-20922","D","-24923"]*/
    }
}
