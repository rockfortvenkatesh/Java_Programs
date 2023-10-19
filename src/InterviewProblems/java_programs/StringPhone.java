package InterviewProblems.java_programs;

public class StringPhone {
    public static void main(String[] args) {
        String phone = "044123456789";

        String codenumber = phone.substring(0,3);

        String number = phone.substring(3);
        System.out.println(number);
        String format = "("+codenumber +") - "+number.substring(0,3)+ " "+number.substring(3,6)+" "+number.substring(6);
        System.out.println(format);



    }
}
