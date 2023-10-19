package InterviewProblems;

public class longestSubString {

    public static void main(String[] args) {
        int[] a = { 2,3,4,1,5,6,7,8,9};
        int maxlength = 1 ,currentlength = 1 , start = 0 , maxstart = 0;

        for (int i = 1; i < a.length; i++) {
            if(a[i]>a[i-1]){
                currentlength++;
            }else{
                start = i;
                currentlength =1;
            }

        if(currentlength > maxlength){
            maxlength= currentlength;
            maxstart = start;
        }
        }
        for (int i = maxstart; i < maxstart+maxlength  ; i++) {
            System.out.print(" "+a[i]);
        }
    }
}
