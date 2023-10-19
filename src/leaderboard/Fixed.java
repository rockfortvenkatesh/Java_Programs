package leaderboard;

public class Fixed {
    public static void main(String[] args) {
        int arr[] = { -10, -5, 0, 3, 7};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==i){
                System.out.println(arr[i]);
            }
        }
    }
}
