package SlidingWindow;


import OrderedMap.GenerateParenthesis;
import OrderedMap.MyCalendarTwo;

import java.util.List;

public class MyTest {
    public static void main(String[] args) {
       MaxSlidingWindow slidingWindow = new MaxSlidingWindow();

        int[] ints = {1, -1};
        int[] window = slidingWindow.maxSlidingWindow(ints, 1);
        for (int i : window) {
            System.out.println(i);
        }
    }
}
