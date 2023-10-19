package relevel_test;

public class Nonrepatchar {
    public static void main(String[] args) {
        String s = "venvkatesh";

        for(int i = 0 ;i < s.length() ;i++){

            char c = s.charAt(i);
            int count = 0 ;
            for( int j = 0 ; j< s.length() ;j++){
                if(c==s.charAt(j) && i!=j){
                    count++;
                    break;
                }
            }

            if(count==0){
                System.out.println(c);
                break;
            }
        }

    }
}
