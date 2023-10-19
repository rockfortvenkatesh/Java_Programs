package Practice;

import java.util.HashMap;
import java.util.Map;

public class duplicate_Array {
    public static void main(String[] args) {
        int[] arrayy = {1, 2, 3, 4 ,3};

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int j : arrayy) {
            if (map.containsKey(j)) {
                int value = map.get(j);
                map.put(j, value + 1);
            } else {
                map.put(j, 1);
            }

        }
        System.out.println(map);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 2) {
                System.out.println("Key with value 2: " + entry.getKey());
            }
        }

//        for (int i = 0; i < map.size(); i++) {
//            if(map.containsKey(arrayy[i])){
//                System.out.println(arrayy[i]);
//            }
//        }
    }


}
