package part1.ByteDanceTest;// 本题为考试单行多行输入输出规范示例，无需提交，不计分。
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        //5
        //3 5 13 9 12

        //3 22 20  6
        //3 5 20  6
        //3 5 (14 6) 6
        //3 5 ( 8 6 6) 6
        //3 5 (2 6 6 6) 6
        Scanner in = new Scanner(System.in);

        int num = Integer.parseInt(in.nextLine());
        String line = in.nextLine();

        String[] arrStr = line.split(" ");
        int[] arr = new int[arrStr.length];
        for (int j = 0; j < arrStr.length; j++) {
            arr[j] = Integer.parseInt(arrStr[j]);
        }

        int count = 0;
        int compare = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > compare) {
                count += arr[i] / compare;
                compare = arr[i] % compare;
            }
        }
    }
}