package relevel_test;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

       int result =  findfactorial(n);
        System.out.println(result);
    }

    private static int findfactorial(int n) {
       if(n== 0|| n==1){
           return 1;
       }

       return n* findfactorial(n-1);

    }
}
