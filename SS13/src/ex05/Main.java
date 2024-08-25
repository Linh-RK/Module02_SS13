package ex05;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random rd = new Random();
        SortedMap<Integer, Integer> map1 = new TreeMap<>();
        TreeMap<Integer, Integer> map2 = new TreeMap<>(Collections.reverseOrder());
        int size = rd.nextInt(10) + 1;
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add(rd.nextInt(100) + 1);
        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            map1.put(list.get(i), 0);
        }
        System.out.println("Map1");
        System.out.println(map1);
        System.out.println("Min:");
        System.out.println(map1.firstEntry().getKey());
//        Map<Integer, Integer> map2 = map1.reversed();
//        System.out.println("Map2");
//        System.out.println(map2);
        map2.putAll(map1);
        System.out.println("Map2");
        System.out.println(map2);
        System.out.println("Max1");
        System.out.println(map2.firstEntry().getKey());
        map2.remove(map2.firstKey());
        System.out.println("Max2");
        System.out.println(map2.firstKey());

    }


}
