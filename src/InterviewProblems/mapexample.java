package InterviewProblems;

import java.util.HashMap;
import java.util.Map;

public class mapexample {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        map.put("venkat",1);
        map.put("karthick",2);

        System.out.println(map.size());

        for(Map.Entry me :map.entrySet()){
            System.out.println(me.getKey() + " "+ me.getValue());
        }
    }



}
