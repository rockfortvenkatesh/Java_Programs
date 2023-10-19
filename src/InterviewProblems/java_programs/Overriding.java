package InterviewProblems.java_programs;

class one{
     void add(){
         System.out.println("Addition");
    }
}

public class Overriding extends one{
    void add(){
        System.out.println("overriding addtion");
    }

    public static void main(String[] args) {
        Overriding o = new Overriding();
       o.add();
    }



}
