package leaderboard;

public class Reverse {
    public static void main(String[] args) {
        int x = -123456789;
        int reversed = 0 ;
        while(x!=0){
            int digit = x%10;
            x=x/10;
             reversed = reversed * 10 + digit;

        }
        System.out.println(reversed);


    }
}

