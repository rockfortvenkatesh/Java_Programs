package InterviewProblems.java_programs;

public class Direction {
    public static void main(String[] args) {
        String[] direction = {"North","East","west","south"};

        StringBuilder sb = new StringBuilder();

        for (int i = 0 ; i < direction.length;i+=2){
            sb.append("\"").append(direction[i]).append("-").append(direction[i+1]).append("\",");

        }



        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);


    }
}
