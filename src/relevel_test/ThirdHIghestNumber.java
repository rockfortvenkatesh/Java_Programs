package relevel_test;

import java.util.Arrays;

public class ThirdHIghestNumber {
    public static void main(String[] args) {
        int[] arr = {3,2,3,1,2,4,5,5,5};
        int distinct = 0;
        Arrays.sort(arr);
        for(int i = arr.length-2 ; i >0 ;i--){
            if(arr[i]!= arr[i+1]){
                distinct++;
            }
            if(distinct ==2){
                System.out.println(arr[i]);
                break;
            }
        }

    }
}
