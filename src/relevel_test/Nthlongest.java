package relevel_test;

import java.util.ArrayList;
import java.util.Iterator;

public class Nthlongest {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        list.add("venkat");
        list.add("mathan");
        list.add("name");
        System.out.println(list);

        int Longeststring = list.get(0).length();
        int index = 0 ;


        for(int i = 0; i < list.size(); i++)
        {
            if(list.get(i).length() > Longeststring)
            {
                Longeststring = list.get(i).length();
                index = i;
            }
        }
        System.out.println("Index " + index + " "+ list.get(index) + " " + "is the largest and is size " + Longeststring);


    }
}
