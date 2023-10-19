package InterviewProblems.java_programs;

import java.util.HashMap;
import java.util.Map;

public class duplicate {
    public static void main(String[] args) {
        String s = "venkatesh";

        String[] split = s.split("");

        HashMap<String,Integer> map = new HashMap<>();

        for (String value : split) {
            if (map.containsKey(value)) {
                //int count = map.get(value);
                map.put(value, map.get(value) + 1);
            } else {
                map.put(value, 1);
            }
        }
        System.out.println(map);
        for(Map.Entry<String,Integer> m : map.entrySet()){
            if(m.getValue()==2){
                System.out.print(" "+m.getKey()+" : "+ m.getValue());
            }

        }
    }

}
