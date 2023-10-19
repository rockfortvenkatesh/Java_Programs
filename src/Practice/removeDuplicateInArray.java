package Practice;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class removeDuplicateInArray {
    public static void main(String[] args) {
        int d[]={10,20,90,20,50,60,70,10,90,90,110,80,120};
        LinkedHashSet<Integer> s = new LinkedHashSet<>();
        for (int i = 0; i < d.length; i++) {
            if(s.contains(d[i])){
                continue;
            }else{
                s.add(d[i]);
            }
        }
        //Collections.sort(s);
        System.out.println(s);
    }
}
