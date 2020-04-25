package part3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicateFileInSystem {
    public List<List<String>> findDuplicate(String[] paths) {
        //"root/a 1.txt(abcd) 2.txt(efgh)"  input
        //root/a/2.txt                      output

        List<List<String>> resList = new ArrayList<>();
        Map<String,List<String>> contentMap = new HashMap<>();
        for (String path : paths) {
            String[] temp0 = path.split(" ");
            String pathPrefix = temp0[0];

            for (int i = 1; i < temp0.length; i++) {
                String file = temp0[i];

                int separator = file.indexOf("(");
                String fileName = file.substring(0,separator);
                String content = file.substring(separator + 1,file.length() - 1);

                contentMap.putIfAbsent(content,new ArrayList<>());
                List<String> list = contentMap.get(content);
                list.add(pathPrefix + "/" + fileName);
                contentMap.put(content,list);
            }
        }

        for (Map.Entry<String, List<String>> entry : contentMap.entrySet()) {
            List<String> list = entry.getValue();
            if (list.size() >= 2) {
                resList.add(list);
            }
        }

        return resList;
    }
}
