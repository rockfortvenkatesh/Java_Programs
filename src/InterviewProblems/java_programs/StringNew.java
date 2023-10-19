package InterviewProblems.java_programs;

import java.util.*;
public class StringNew {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        //1
        String[] Hash = s.split("#");
        System.out.println(Hash.length);

        //2
        String[] At = s.split("@");
        System.out.println(At.length);

        //3
        String alter = s.replace("#","$");
        System.out.println(alter);

        //4
        String[] fName = s.split("#");

        System.out.println(fName[0].toUpperCase());

        //5
        String spa = s.replace("#", " ");
        String newspa = spa.replace("@"," ");

        String[] lname = newspa.split(" ");
        System.out.println(lname[lname.length-2].toLowerCase());

        //6
        String spaa = s.replace("#", " ");
        String newspaa = spaa.replace("@"," ");

        System.out.println(newspaa);

        //7
        String[] split = fName[0].split("");
        String reverse = "";
        for(int i = split.length-1 ; i >=0;i--){
            System.out.print(reverse+split[i]);
        }
    }
}
