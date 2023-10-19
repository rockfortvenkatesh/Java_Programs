package relevel_test;

import java.util.Arrays;
import java.util.HashMap;

public class frequency_array {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1,2,3,4,5,6,7};

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int j : arr) {
            if (map.containsKey(j)) {
                int count = map.get(j);
                map.put(j, count + 1);
            } else {
                map.put(j, 1);
            }
        }

        System.out.println(map);

//        for(int i = 1 ; i <= map.size() ; i++){
//            if(map.get(i) ==2 )
//                System.out.print(" "+arr[i-1]);
//        }

            //System.out.println(Arrays.toString(arr));
    }


}
