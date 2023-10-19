package InterviewProblems;

import java.util.HashMap;

public class task {
    public static void main(String[] args) {

        String str = "aaaabbbccccdddd";
        HashMap<String,Integer> map = new HashMap<String,Integer>();

        String[] split = str.split("");

        for(int i = 0 ; i < split.length;i++){
            if(map.containsKey(split[i])){
                int val = map.get(split[i]);
                map.put(split[i],val+1);
            }else{
                map.put(split[i],1);
            }
        }

        System.out.println(map);
    }
}
