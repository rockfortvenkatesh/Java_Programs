package InterviewProblems;

public class albhabetsCount {
    public static void main(String[] args) {
        String s = "aabbbcddaaa";
        StringBuilder sb = new StringBuilder();

        char currentchar = s.charAt(0);
        int count = 1 ;
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i)==currentchar){
                count++;
            }else{
                sb.append(currentchar);
                sb.append(count);
                currentchar = s.charAt(i);
                count = 1;
            }

        }
        sb.append(currentchar);
        sb.append(count);
        System.out.println(sb);
    }
}
