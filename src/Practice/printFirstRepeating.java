package Practice;

import java.util.HashSet;

public class printFirstRepeating {
    public static void main(String[] args) {
        int arr[]={2,3,4,2,1,5,6};

        int min = -1;
        HashSet<Integer> set = new HashSet<>();

        for (int i = arr.length - 1; i >= 0; i--) {

            if (set.contains(arr[i]))
                min = i;

            else
                set.add(arr[i]);
        }
        System.out.println(set);
        if(min != -1){
            System.out.println(arr[min]+ " this is first repeating element");
        }else{
            System.out.println("no first repeat element found");
        }
    }
}
