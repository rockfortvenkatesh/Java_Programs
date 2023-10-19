package relevel_test;

public class Secondmax {

    public static void main(String[] args) {
        //arr[] = {12, 35, 1, 10, 34, 1}
       int[] arr = {12, 35, 1, 10, 34, 1};

       int largest=0;
       int secondlargest=0;

       for(int i = 0 ;i < arr.length;i++){
           if(arr[i]>largest){
               secondlargest=largest;
               largest=arr[i];
           }else if(arr[i]>secondlargest){
               secondlargest = arr[i];
           }

       }

        System.out.println(secondlargest);
    }
}
