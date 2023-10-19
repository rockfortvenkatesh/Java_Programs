package InterviewProblems.java_programs;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
         long output= fact(n);
        System.out.println(output);
    }

    private static long fact(int n) {
        if(n==0)
            return 1;
        else
            return n*fact(n-1);
    }
}
