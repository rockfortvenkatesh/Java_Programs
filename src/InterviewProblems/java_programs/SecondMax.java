package InterviewProblems.java_programs;

public class SecondMax {

    public static void main(String[] args) {
        int[] arr = {1,5,4,2,3};
        int largest =0;
        int secondlargest=0;
        for(int i = 0 ; i<arr.length ;i++){
            if(arr[i]>largest){
                secondlargest =largest;
                largest=arr[i];
            }else if(arr[i]> secondlargest){
                secondlargest = arr[i];
            }
        }
        System.out.println(secondlargest);
    }
}
