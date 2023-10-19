package relevel_test;
import java.util.*;
public class subtract_array {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        int[] c=new int[n];

        for(int i=0;i<a.length;i++) {
            a[i]=s.nextInt();
        }
        for(int i=0;i<a.length;i++) {
            b[i]=s.nextInt();
        }
        for(int i=0;i<a.length;i++) {
            c[i]=b[i]-a[i];
        }
        Arrays.sort(c);

        System.out.println(Arrays.toString(c));
    }

}
