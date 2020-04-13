package part1.OrderedMap;


public class MyTest {
    public static void main(String[] args) {
        MyCalendarTwo calendarTwo = new MyCalendarTwo();

//        calendarTwo.book(10, 20); // returns true
//        calendarTwo.book(50, 60); // returns true
//        calendarTwo.book(10, 40); // returns true
//        calendarTwo.book(5, 15); // returns false
//        calendarTwo.book(5, 10); // returns true
//        calendarTwo.book(25, 55); // returns true


        //["MyCalendarTwo","book","book","book","book","book","book","book","book","book","book"]
        //[[],[24,40],[43,50],[27,43],[5,21],[30,40],[14,29],[3,19],[3,14],[25,39],[6,19]]
//        System.out.println(calendarTwo.book(24,40));
//        System.out.println(calendarTwo.book(43,50));
//        System.out.println(calendarTwo.book(27,43));
//        System.out.println(calendarTwo.book(5,21));
//        System.out.println(calendarTwo.book(30,40));
//        System.out.println(calendarTwo.book(14,29));
//        System.out.println(calendarTwo.book(3,19));
//        System.out.println(calendarTwo.book(3,14));
//        System.out.println(calendarTwo.book(25,39));
//        System.out.println(calendarTwo.book(6,19));

//        GenerateParenthesis generateParenthesis = new GenerateParenthesis();
//        List<String> list = generateParenthesis.generateParenthesis(3);
//        for (String s : list) {
//            System.out.println(s);
//        }

        String s = "[[],[],[],[],[46],[],[],[],[],[868],[],[],[],[525],[],[],[],[],[123],[646],[],[229],[],[],[],[871],[],[],[285],[],[],[],[],[45],[140],[837],[545],[],[],[],[],[],[],[561],[237],[],[633],[98],[806],[717],[],[],[186],[],[],[],[],[],[],[268],[],[29],[],[],[],[],[866],[],[239],[3],[850],[],[],[],[],[],[],[],[310],[],[674],[770],[],[525],[],[425],[],[],[720],[],[],[],[373],[411],[],[831],[],[765],[701],[]]";
                s=s.replace('[','{');
                s=s.replace(']','}');
        System.out.println(s);
    }
}
