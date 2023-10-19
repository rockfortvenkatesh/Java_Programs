package relevel_test;

public class string_swap {

    public static void main(String[] args) {
         String a = "one";
         String b = "two";

         b = b.concat(a);
         a= b.substring(0,3);
         b= b.substring(3,6);

        System.out.println("b = " +b);
        System.out.println("a = " +a);




    }
}
