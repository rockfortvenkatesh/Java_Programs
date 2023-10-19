package relevel_test;

import java.util.*;

public class prime_sum_subsequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] A = new int[n];
        for (int i = 0 ; i<n  ; i++){
            A[i] = sc.nextInt();
        }
        int num  = primeSum(A,n);
        System.out.println(num);
    }

    private static int primeSum(int[] a, int n) {
            int max = 0 ;
            int total1 = 0 ;
            int total2 = 0;
            for(int i = 0 ; i < n ; i++){
                for(int j = i+1; j < n ;j++ ){
                    total1 += a[i]+a[j];
                }
                break;
            }
          boolean prime1 =   isprime(total1);

        for(int i = 0 ; i < n ; i++){
            for(int j = i+2; j < n ;j++ ){
                total2 += a[i]+a[j];
            }
            break;
        }
       boolean prime2 =  isprime(total2);
        if(prime1 && prime2){
            max= Math.max(total1,total2);
        }
        return max;

    }

    private static boolean isprime(int check) {
        boolean prime = false;
        for(int i = 2 ; i < check/2; i++){
            prime = check % i != 0;
        }
        return prime;
    }
}
