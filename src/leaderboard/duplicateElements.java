package leaderboard;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class duplicateElements {


//    () -> {
//        System.out.println("hello");
//    }
    public static void main(String[] args) {
        int[] arr= { 1,2,3,4,5,3,2,1};

        int n = arr.length;

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i <= n - 1; i++) {
            if(map.containsKey(arr[i])){
                int val = map.get(arr[i]);
                map.put(arr[i],val+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        System.out.println(map);
        for(Map.Entry<Integer,Integer> m : map.entrySet()){
            if(m.getValue()==2){
                System.out.println(m.getKey()+ " : "+m.getValue());
            }
        }
    }
}
