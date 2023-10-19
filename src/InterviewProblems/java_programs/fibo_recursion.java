package InterviewProblems.java_programs;

public class fibo_recursion {
    public static void main(String[] args) {
        int n = 10;

        for (int i = 0; i < n; i++) {
            int fibo = findfibo(i);
            System.out.print(fibo+ " ");
        }
    }

    private static int findfibo(int i) {
        if(i <=1)
            return  i;
        else
            return findfibo(i-2)+findfibo(i-1);
    }
}
