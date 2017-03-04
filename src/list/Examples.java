package list;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Adrian on 2017-03-04.
 */
public class Examples {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(10);
        System.out.println(CollectionMath.sum(set));

        Map<String,Integer> map = new HashMap<>();
        map.put("ciasta", 50);
        map.put("laptopy", 16);
        System.out.println(map.get("ciasta"));
        System.out.println(map.get("laptopy"));
        System.out.println(map.containsKey("cos"));
        System.out.println(map.get("cos") != null);

    }
}
