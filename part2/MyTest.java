package part2;

public class MyTest {
    public static void main(String[] args) {
//        RomanToInt romanToInt = new RomanToInt();
//        int n = romanToInt.romanToInt("LVIII");
//        System.out.println(n);


//        MajorityElement element = new MajorityElement();
//        int i = element.majorityElement(new int[]{3, 2, 3});
//        System.out.println(i);


//        Intersect intersect = new Intersect();
//        int[] ints = intersect.intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2});
//        for (int anInt : ints) {
//            System.out.println(anInt);
//        }

        KthSmallest smallest  = new KthSmallest();
        int[][] ints = new int[][] {
                {1,  5,  9},
                {10, 11, 13},
                {12, 13, 15}
        };
        smallest.kthSmallest(ints,8);
    }
}
