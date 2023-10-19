package InterviewProblems;

public class abctask {
    public static void main(String[] args) {
        String str ="aaabbbbcccccdddaccc";


        StringBuilder sb = new StringBuilder();
        char currentChar = str.charAt(0);
        int count =1;
        for (int i = 1; i < str.length(); i++) {
                if(currentChar == str.charAt(i)){
                    count++;
                }else{
                    sb.append(currentChar);
                    sb.append(count);
                    count = 1;
                    currentChar = str.charAt(i);
                }
        }
        sb.append(currentChar);
        sb.append(count);
        System.out.println(sb);
    }
}
