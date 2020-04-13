package part1.Unknown;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LFU {
    Map<Integer,Node> cacheMap;
    Map<Integer,LinkedList<Integer>> freqMap;
    int minFreq;
    int capacity;

    public LFU(int capacity) {
        this.capacity = capacity;
        cacheMap = new HashMap<>(capacity);
        freqMap = new HashMap<>();
    }

    public int get(int key) {
        if (cacheMap.get(key) == null || cacheMap.size() <= 0) return -1;
        Node Node = cacheMap.get(key);
        update(Node);
        return Node.getValue();
    }

    public void put(int key, int value) {
        //判断数据是否已经缓存
        Node node = cacheMap.get(key);
        //已经缓存，更新该数据
        if (node != null) {
            Node newNode = new Node(key, value,node.freq);
            update(newNode);
            cacheMap.put(key,newNode);
        } else if (node == null && capacity != 0){
            //未缓存，cache it判断容器容量
            if (cacheMap.size() >= capacity) {
                //容量不够，按照LFU删除一个数据
                LinkedList<Integer> sameFreqList = freqMap.get(minFreq);
                if (sameFreqList != null && sameFreqList.size() > 0) {
                    Integer minKey = sameFreqList.pollFirst();
                    cacheMap.remove(minKey);
                }
            }
            //插入新数据
            Node newNode = new Node(key, value,0);
            update(newNode);
            cacheMap.put(key,newNode);
        }

    }

    private void update(Node node) {
        int freq = 0;
        if (node.getFreq() != 0) {
            freq = node.getFreq();
            LinkedList<Integer> sameFreqList = freqMap.get(freq);
            sameFreqList.remove(node.getKey());
            if (sameFreqList.size() == 0 && minFreq == freq) {
                minFreq++;
            }
            freqMap.put(freq,sameFreqList);
        } else {
            minFreq = 1;
        }

        if (freqMap.get(freq + 1) == null) {
            freqMap.put(freq + 1,new LinkedList<>());
        }
        LinkedList<Integer> nextList = freqMap.get(freq + 1);
        nextList.addLast(node.getKey());
        freqMap.put(freq + 1,nextList);

        node.setFreq(freq + 1);
    }
    
    class Node {
        Integer key;
        Integer value;
        Integer freq;

        public Node(Integer key, Integer value, Integer freq) {
            this.key = key;
            this.value = value;
            this.freq = freq;
        }

        public Integer getKey() {
            return key;
        }

        public void setKey(Integer key) {
            this.key = key;
        }

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }

        public Integer getFreq() {
            return freq;
        }

        public void setFreq(Integer freq) {
            this.freq = freq;
        }
    }
}
