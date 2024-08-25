package ex03;

import java.util.*;

public class Sort {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("one", 1);
        hashMap.put("two", 2);
        hashMap.put("three", 3);
        hashMap.put("four", 4);
        hashMap.put("five", 5);
        hashMap.put("six", 6);
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(hashMap.entrySet());
        System.out.println(entryList);
//        Collections.sort();
    }

}
