package relevel_test;

public class middle_number {

    public static void main(String[] args) {
        int[] a = {1,2,3,4};

        int  len = a.length;
        int start= 0 ;
        int end = len-1;
        int mid=len/2;
        if(len%2 == 1){
            System.out.println(a[mid]);
        }else{
            start = mid;
            end = mid+1;
            System.out.println(start +", "+end);
        }
    }
}
