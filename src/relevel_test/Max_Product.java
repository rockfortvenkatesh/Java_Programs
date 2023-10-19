package relevel_test;
import java.util.*;
public class Max_Product {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = {9,5,12,7,8};
        int n = arr.length;
        System.out.println(maxproduct(arr,n));
    }

    private static int maxproduct(int[] arr, int n) {
        int product =1;
        int a = arr[0],b= arr[1];

        for(int i = 0 ; i<n;i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] * arr[j] > a * b) {
                     a= arr[i] ;
                     b= arr[j];
                }
            }
        }
        return a * b ;
    }
}
