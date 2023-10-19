package InterviewProblems;
import java.util.ArrayList;
import java.util.List;

 class flattern {
    public static void main(String[] args) {
        Object[] array = { 1, 2, new Object[]{ 3, 4, new Object[]{ 5 }, 6, 7 }, 8, 9, 10 };
        List<Object> flattenedArray = flattenArray(array);
        System.out.println(flattenedArray);
    }

    public static List<Object> flattenArray(Object[] array) {
        List<Object> flattenedList = new ArrayList<>();
        for (Object element : array) {
            if (element instanceof Object[]) {
                List<Object> nestedList = flattenArray((Object[]) element);
                flattenedList.addAll(nestedList);
            } else {
                flattenedList.add(element);
            }
        }
        return flattenedList;
    }
}
