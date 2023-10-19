package InterviewProblems.java_programs;

public class Overloading {

    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b,int c){
        return a+b+c;
    }


    public static void main(String[] args) {
        Overloading ov = new Overloading();
        System.out.println(ov.add(1,2));
        System.out.println(ov.add(1,2,3));
    }
}
