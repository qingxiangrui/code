package part1.SlidingWindow;


public class MyTest {
    public static void main(String[] args) {
//       MaxSlidingWindow slidingWindow = new MaxSlidingWindow();
////
////        int[] ints = {1, -1};
////        int[] window = slidingWindow.maxSlidingWindow(ints, 1);
////        for (int i : window) {
////            System.out.println(i);
////        }

//        char[] chars = new char[6];//aa 两个空格 null c
//        chars[0] = 'a';
//        chars[1] = 'a';
//        chars[2] = ' ';
//        chars[3] = ' ';
//        chars[5] = 'a';
//        String s = new String(chars);
//        System.out.println(s);


//        ReverseWords reverseWords = new ReverseWords();
//        String s = reverseWords.reverseWords("  hello world!  ");
//        System.out.println(s);
//        MaxQueue queue = new MaxQueue();
//        queue.push_back(1);
//        queue.push_back(2);
//        System.out.println(queue.max_value());
//        System.out.println(queue.pop_front());
//        System.out.println(queue.max_value());

//        MaxQueue queue = new MaxQueue();
//        String[] funcs = {
//                "max_value","pop_front","max_value","push_back",
//                "max_value","pop_front","max_value","pop_front",
//                "push_back","pop_front","pop_front","pop_front",
//                "push_back","pop_front","max_value","pop_front",
//                "max_value","push_back","push_back","max_value",
//                "push_back","max_value","max_value","max_value",
//                "push_back","pop_front","max_value","push_back",
//                "max_value","max_value","max_value","pop_front",
//                "push_back","push_back","push_back","push_back",
//                "pop_front","pop_front","max_value","pop_front",
//                "pop_front","max_value","push_back","push_back",
//                "pop_front","push_back","push_back","push_back",
//                "push_back","pop_front","max_value","push_back",
//                "max_value","max_value","pop_front","max_value",
//                "max_value","max_value","push_back","pop_front",
//                "push_back","pop_front","max_value","max_value",
//                "max_value","push_back","pop_front","push_back",
//                "push_back","push_back","pop_front","max_value",
//                "pop_front","max_value","max_value","max_value",
//                "pop_front","push_back","pop_front","push_back",
//                "push_back","pop_front","push_back","pop_front",
//                "push_back","pop_front","pop_front","push_back",
//                "pop_front","pop_front","pop_front","push_back",
//                "push_back","max_value","push_back","pop_front",
//                "push_back","push_back","pop_front"
//        };
//        int[][] input = new int[][] {
//                {},{},{},{46},{},{},{},{},{868},{},{},{},{525},{},{},{},{},{123},{646},{},{229},{},{},{},{871},{},{},{285},{},{},{},{},{45},{140},{837},{545},{},{},{},{},{},{},{561},{237},{},{633},{98},{806},{717},{},{},{186},{},{},{},{},{},{},{268},{},{29},{},{},{},{},{866},{},{239},{3},{850},{},{},{},{},{},{},{},{310},{},{674},{770},{},{525},{},{425},{},{},{720},{},{},{},{373},{411},{},{831},{},{765},{701},{}
//
//        };
//
//        int[] myoutPut = new int[1024];
//        int j = 0;
//        for (int i = 0;i < funcs.length;i++) {
//            String func = funcs[i];
//            if (func.equals("max_value")) {
//                myoutPut[j++] = queue.max_value();
//            }
//            if (func.equals("pop_front")) {
//                myoutPut[j++] = queue.pop_front();
//            }
//            if (func.equals("push_back")) queue.push_back(input[i][0]);
//        }
//
//
//        //[null,-1,-1,-1,null,46,46,-1,-1,null,868,-1,-1,null,525,-1,-1,-1,null,null,646,null,646,646,646,null,123,871,null,871,871,871,646,null,null,null,null,229,871,646,285,45,646,null,null,140,null,null,null,null,837,806,null,806,806,545,806,806,806,null,561,null,237,806,806,806,null,633,null,null,null,98,866,806,866,866,866,717,null,186,null,null,268,null,29,null,866,239,null,3,850,310,null,null,806,null,674,null,null,770]
//        String expect = "-1,-1,-1,null,46,46,-1,-1,null,868,-1,-1,null,525,-1,-1,-1,null,null,646,null,646,646,646,null,123,871,null,871,871,871,646,null,null,null,null,229,871,646,285,45,646,null,null,140,null,null,null,null,837,806,null,806,806,545,806,806,806,null,561,null,237,806,806,806,null,633,null,null,null,98,866,806,866,866,866,717,null,186,null,null,268,null,29,null,866,239,null,3,850,310,null,null,806,null,674,null,null,770";
//        String[] expectArr = expect.split(",");
//        for (int i = 0; i < expectArr.length; i++) {
//            String resStr = expectArr[i];
//            if (resStr.equals("null")) {
//                if (myoutPut[i] == -1) continue;
//                System.out.println("error null" + myoutPut[i]);
//            } else {
//                if (myoutPut[i] == Integer.parseInt(resStr)) continue;
//                System.out.println("error not null" + myoutPut[i] + " " + resStr);
//            }
//        }

        MaxQueue queue = new MaxQueue();
        queue.push_back(10);
        queue.push_back(20);
        queue.push_back(30);
        queue.push_back(10000);
        System.out.println(queue.max_value());
        queue.push_back(500);
        queue.push_back(1);
        System.out.println(queue.max_value());
        System.out.println(queue.pop_front());
        System.out.println(queue.pop_front());
        System.out.println(queue.max_value());

    }
}
