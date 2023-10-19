//Question Name: Minimize the integer
//
//        Problem Statement
//
//        Antonio got a very large integer as his christmas present from his parents. Antonio does not like large integers
//        and hence decided to change a few digits of this integer and make it as small as possible.
//
//        But changing too many digits will make Antonio’s parents sad. More formally if Antonio changes more than K
//
//        digits of the integer, his parents will become sad. Antonio does not want that to happen and hence will change at most K digits of the given integer.
//
//        Also if the final integer contains any leading zeros, Antonio’s parents again become sad. So Antonio will
//        perform the K changes in such a way that the final integer does not contain any leading zeros.
//
//        Given the integer Antonio got and K(maximum number of changes Antonio can perform), print the minimum integer that Antonio can get.
//
//        Input Format
//
//        First line contians a single integer denoting the integer Antonio got as his christmas present.
//        Next line contains a single integer denoting K.
//        Output Format
//
//        Print the minimum integer that Antonio can get.
//        Constraints
//
//        1<=number of digits in the integer<=105
//        1<=K<=number of digits in the integer
//        Its guaranteed that the given integer does not contain any leading zeros.
//        Sample Input 1
//
//        2399
//
//        2
//
//        Sample Output 1
//
//        1099
//
//        Explanation of Sample 1
//
//        Antonio can change the first digit to ‘1’ and change the second digit to ‘0’. It can be proved that 1099 is
//        the minimum possible integer that Antonio can get.



//
//
//Relax Days
//        Problem Statement
//
//
//
//        There is a teacher and you are given n number of days in an array arr. For a particular day arr[i] these are the possible chances
//
//        If arr[i]=0 then you can teach neither physics nor chemistry
//
//
//        If arr[i]=1 then you cannot teach physics but you can teach chemistry
//
//
//        If arr[i]=2 then you can teach physics but not chemistry
//
//
//        If arr[i]=3 then you can teach any one of the two subjects i.e you can teach either physics or chemistry
//
//
//        For the i-th day you can either teach physics(if arr[i]=2 or arr[i]=3) or you can teach chemistry
//        (if arr[i]=1 or arr[i]=3) or you can relax(i.e teach neither physics nor chemistry and take rest)
//
//        Your task is to count and print the minimum number of days where you will relax(i.e teach neither physics nor chemistry and take rest).
//
//        Note that the teacher will also not teach the same subject on two consecutive days.
//
//
//
//
//
//        Constraints
//
//
//
//        1<=n<=10^5
//        0<=arr[i]<4
//
//
//
//
//        Input :
//
//
//
//        The first line contains n the number of days the next line contains all the n elements
//
//
//
//
//
//        Output :
//
//
//
//        Print the minimum number of relax days
//
//
//
//
//
//        Sample Input 1 :
//
//
//
//        4
//
//        1 3 2 0
//
//
//
//
//
//        Sample Output 1 :
//
//
//
//        2
//
//
//
//
//
//        Sample Explanation 1 :
//
//
//
//        One of the optimal approaches to minimize the number of relax days in this test case could be:
//        On day 1 you can teach chemistry
//        On day 2 you can relax
//        On day 3 you can teach physics
//        On day 4 you can relax
//        So total relax days=2
//
//
//
//
//        Sample Input 2 :
//
//
//
//        7
//
//        1 3 3 2 1 2 3
//
//
//
//
//
//        Sample Output 2:
//
//
//
//        0
//
//
//
//
//
//        Sample Explanation 2 :
//
//
//
//        One of the optimal approaches to minimize the number of relax days in this test case could be:
//        On day 2,4,6 teach physics
//        On day 1,3,5,7 teach chemistry
//        So total relax days=0
package relevel_test;
import java.util.*;

public class minimize_the_integer {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k =sc.nextInt();
        int p = (int) Math.pow(10,k);
        int mul = 0;
        int reverse = reverse(n);

           int low = reverse / p;
           if(low <=0){
               mul = p/10;
           }else {
               mul = (low * p) + 1;
           };

        if(low>0){
            mul =reverse(mul);
        }
        System.out.println(mul);

    }
    public static int reverse(int n){
        int reverse = 0;
        while (n != 0) {
            int remain = n % 10;
            reverse = reverse * 10 + remain;
            n = n / 10;
        }
        return reverse;
    }
    }




