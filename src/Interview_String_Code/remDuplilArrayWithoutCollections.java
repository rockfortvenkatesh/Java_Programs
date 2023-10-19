package Interview_String_Code;

import java.util.Arrays;

public class remDuplilArrayWithoutCollections {

    public static void main(String[] args) {
        int a[] = { 2,5,1,4,6,3,4,6};

        int[] result = new int[a.length];

        Arrays.sort(a);

        int first = a[0];

        result[0] = first;
        for (int i = 1; i < a.length; i++) {
            int ch = a[i];

            if(ch != first){
                result[i]=ch;
            }
            first = ch;
        }
        //System.out.println(Arrays.toString(result));
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
    }
}
