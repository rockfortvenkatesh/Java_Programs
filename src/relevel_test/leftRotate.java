package relevel_test;

import java.util.Arrays;

public class leftRotate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = 3;
        System.out.println(Arrays.toString(arr));


        for(int i = 0 ; i<n ;i++){
            int first = arr[0];
            int j;
            for( j = 0 ;j<arr.length-1;j++){
                arr[j] = arr[j+1];
            }
            arr[j]=first;
        }

        System.out.println(Arrays.toString(arr));
    }
}
