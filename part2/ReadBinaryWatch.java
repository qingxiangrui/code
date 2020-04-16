package part2;

import java.util.*;
import java.util.stream.Collectors;

public class ReadBinaryWatch {
    private Set<String> res = new HashSet<>();

    public List<String> readBinaryWatch(int num){
        List<String> list = new ArrayList<>();
        int[] times = new int[] {8,4,2,1,32,16,8,4,2,1};
        int[] on = new int[10];

        dfs(on,0,0,num,times);
        list.addAll(res);
        return list;
    }

    private void dfs(int[] on, int index, int total, int num, int[] times) {
        if (total == num) {
            addTime(on,times);
            return;
        }
        for (int i = index; i < on.length; i++) {
            if (on[i] == 0) {
                on[i] = 1;
                dfs(on,index + 1,total + 1,num,times);
                on[i] = 0;
            }
        }
    }

    private void addTime(int[] on, int[] times) {
        int hour = 0,minute = 0;
        for (int i = 0; i < on.length; i++) {
            if (on[i] == 1) {
                if (i < 4) {
                    hour += times[i];
                } else {
                    minute += times[i];
                }
            }
        }

        if (hour < 12 && minute < 60) {
            res.add(String.format("%d:%02d",hour,minute));
        }
    }

    public static void main(String[] args) {
        ReadBinaryWatch watch = new ReadBinaryWatch();
        List<String> list = watch.readBinaryWatch(2);
        System.out.println(list.size());


        String str = "\"0:03\",\"0:05\",\"0:06\",\"0:09\",\"0:10\",\"0:12\",\"0:17\",\"0:18\",\"0:20\",\"0:24\",\"0:33\",\"0:34\",\"0:36\",\"0:40\",\"0:48\",\"1:01\",\"1:02\",\"1:04\",\"1:08\",\"1:16\",\"1:32\",\"2:01\",\"2:02\",\"2:04\",\"2:08\",\"2:16\",\"2:32\",\"3:00\",\"4:01\",\"4:02\",\"4:04\",\"4:08\",\"4:16\",\"4:32\",\"5:00\",\"6:00\",\"8:01\",\"8:02\",\"8:04\",\"8:08\",\"8:16\",\"8:32\",\"9:00\",\"10:00\"";
        String[] split = str.split(",");
        List<String> collect = Arrays.stream(split).collect(Collectors.toList());
        //System.out.println(collect);
        System.out.println(collect.size());

//        int flag = -1;
//        for (String s : list) {
//            for (String s1 : collect) {
//                if (s.equals(s1)) {
//                    flag = 1;
//                    break;
//                }
//            }
//            if (flag == -1) {
//                System.out.println(s);
//            }
//        }
    }

}
