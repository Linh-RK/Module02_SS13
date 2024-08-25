package ex01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckRepeatTimes {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(List.of(1, 2, 3, 4, 5, 2, 5, 8, 3, 2));
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i < list.size(); i++) {
            if(map.containsKey(list.get(i))){
                map.put(list.get(i), map.get(list.get(i)) + 1);
            }else
                map.put(list.get(i), 1);
        }
        System.out.println(map);
    }
}
