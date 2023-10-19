package relevel_test;

import java.util.HashSet;

public class remove_duplicates {
    public static void main(String[] args) {
        int[] array = new int[] {10,20,10,30,40,10,20};

        HashSet<Integer> set = new HashSet<>();
        int j = 0;
        int[] temp = new int[array.length];
        for(Integer element : array){
            if(set.add(element)){
                temp[j++] = element;
            }
            //set.add(element);
        }
        //set.stream().sorted().forEach(System.out::println);
        //System.out.println(set);

        for(int i = 0 ; i < j ;i++){
            System.out.print( " " +temp[i]);
        }
    }
}
