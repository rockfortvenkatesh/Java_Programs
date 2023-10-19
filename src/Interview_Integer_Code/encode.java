package Interview_Integer_Code;

import java.util.Scanner;

public class encode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        final String input = "ATHENS";
        StringBuilder sb = new StringBuilder();

        if(n == 0 )
            System.out.println(input.charAt(0));

        while(n>0){
            int rem = n%input.length();
            sb.insert(0,input.charAt(rem));
            n = n/input.length();
        }

        System.out.println(sb);
    }
}
