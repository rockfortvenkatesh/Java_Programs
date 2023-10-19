package leaderboard;

public class degreeOfAnArray {
    public static void main(String[] args) {
        int arr[] = { 5,2,2,1,3,4};

        int n = arr.length;
        int count = 1 ;
        for (int i = 0; i < n-1; i++) {
            if(arr[i]==arr[i+1]){
                count= count+1;
            }
        }
        System.out.println(count);
    }
}
