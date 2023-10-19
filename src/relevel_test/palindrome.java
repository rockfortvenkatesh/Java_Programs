package relevel_test;

public class palindrome {
    public static void main(String[] args) {
        String str = "abcba";
        int a = 0 ;
        int b = str.length()-1;
        char[]  c = str.toCharArray();
         while( a < b ){
             if(c[a] != c[b]){
                 System.out.println(str +" Not a palidrome");
                 break;
             }
            a++;b--;
             System.out.println(str + " This Is s palidrome");
             break;
         }


    }
}
