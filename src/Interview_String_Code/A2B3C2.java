package Interview_String_Code;

public class A2B3C2 {
    public static void main(String[] args) {
        int count = 0 ;
        StringBuilder result = new StringBuilder();
        String strr="";
        String input = "2A3B2C1D";

        for (int i = 0; i < input.length(); i++) {
            if(isNum(input.charAt(i))){
                count = (count*10)+input.charAt(i)-'0';//input.charAt(i)-'0';//;
            }else{
                strr+=input.charAt(i);
                if(count==0) result.append(strr);
                while(count>0){
                    result.append(strr);
                    count--;
                }
                strr="";
        }
    }
        System.out.println(result);
}

    private static boolean isNum(char c) {
        return c > '0' && c < '9';
    }
    }
