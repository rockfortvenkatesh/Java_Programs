package Interview_String_Code;

public class reverseWords {
    public static void main(String[] args) {
        String s = "i like this program very much ";
        String trim = s.replaceAll("[^0-9a-zA-Z]", " ");
        String[] split = trim.split(" ");
        for (int i = split.length-1 ; i >0; i--) {
            System.out.print(split[i]+" ");
        }

    }
}
