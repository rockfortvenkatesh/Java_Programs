package InterviewProblems;

import java.util.HashMap;

public class number {
    public static void main(String[] args) {
        long a = 1432532432434L;

        String s = Long.toString(a);
        HashMap<Character,Integer> hs = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
                if(hs.containsKey(s.charAt(i))){
                    int value = hs.get(s.charAt(i));
                    hs.put(s.charAt(i),value+1);
                }else{
                    hs.put(s.charAt(i),1);
                }
        }


        for (int i = 0; i < hs.size(); i++) {
            if(hs.get(s.charAt(i))>2){
                System.out.print(" "+s.charAt(i));

            }
        }


    }
}
