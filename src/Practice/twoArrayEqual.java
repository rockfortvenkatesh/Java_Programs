package Practice;

import java.util.Arrays;

public class twoArrayEqual {
    public static void main(String[] args) {
        int a[] = {1,2,3};

        int start = 0 ;
        int temp;
         int end  = a.length-1;
         while(start < end){
             temp =a[start];
             a[start]= a[end];
             a[end]= temp;
             start++;
             end--;
         }
        System.out.println(Arrays.toString(a));

    }
}
