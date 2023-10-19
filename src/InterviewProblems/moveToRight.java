package InterviewProblems;

import java.util.Arrays;

public class moveToRight {
    public static void main(String[] args) {
        int[] a= {1,0,0,3,0,4,5};
        int left = 0 ;
        for (int i = 0; i < a.length; i++) {

            if(a[i] !=0 ){
                a[left]= a[i];
                left++;
            }
        }

        while(left<a.length){
            a[left] = 0 ;
            left++;
        }
        System.out.println(Arrays.toString(a));
    }
}
