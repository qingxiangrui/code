package part1.ByteDanceTest;// 本题为考试单行多行输入输出规范示例，无需提交，不计分。
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //2
        //6
        //3 7 1 4 1 2
        //3 7 3 6 3 2
        //5
        //1 1 1 1 1
        //1 2 1 3 1
        Scanner in = new Scanner(System.in);

        int num = Integer.parseInt(in.nextLine());
        int flag = -1;
        List<String> res = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            int len = Integer.parseInt(in.nextLine());
            int[] arr1 = new int[len];
            int[] arr2 = new int[len];
            String line1 = in.nextLine();
            String line2 = in.nextLine();

            String[] arrStr1 = line1.split(" ");
            for (int j = 0; j < arrStr1.length; j++) {
                arr1[j] = Integer.parseInt(arrStr1[j]);
            }


            String[] arrStr2 = line2.split(" ");
            for (int k = 0; k < arrStr2.length; k++) {
                arr2[k] = Integer.parseInt(arrStr2[k]);
            }

            int[] temp = new int[len];
            for (int i1 = 0; i1 < arr2.length; i1++) {
                temp[i1] = arr2[i1] - arr1[i1];
            }
            int left = -1,mid = -1, right = -1,count = 0;
            for (int i1 = 0; i1 < temp.length; i1++) {
                if (i1 == 0 && temp[i1] != 0 && temp[i1 + 1] == 0) {
                    count++;
                    continue;
                }
                if (i1 == temp.length - 1 && temp[i1] != 0 && temp[i1 - 1] == 0){
                    count++;
                    continue;
                }
                if (temp[i1] != 0 && temp[i1 - 1] == 0 && temp[i1 + 1] == 0) count++;
            }
           if (count >= 2) {
               res.add("NO");
           } else {
               res.add("YES");
           }

//            Integer add = null;
//            int needChange = -1;
//            for (int a = 0; a < arr1.length; a++) {
//                if (arr1[a] == arr2[a] && needChange == -1) {
//                    add = null;
//                    continue;
//                }
//                int sub = arr2[a] - arr1[a];
//                if (add == null) {
//                    needChange = 1;
//                    add = sub;
//                } else {
//                    if (add != sub) {
//                        flag = 1;
//                        res.add("NO");
//                        break;
//                    }
//                }
//            }
//            if (flag == -1) {
//                res.add("YES");
//            }
//
//        for (String s : res) {
//            System.out.println(s);
//        }
          for (String s : res) {
            System.out.println(s);
        }
    }
}
}