package ex02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckContain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(List.of(1, 2, 3, 4, 5, 2, 5, 8, 3, 2));
        List<Integer> unique = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i < list.size(); i++) {
            if(map.containsKey(list.get(i))){
                map.put(list.get(i), map.get(list.get(i)) + 1);
            }else
                map.put(list.get(i), 1);
        }
        System.out.println("Map");
        System.out.println(map);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1){
                unique.add(entry.getKey());
            }
        }
        System.out.println("Unique element:");
        System.out.println(unique);
    }
}
