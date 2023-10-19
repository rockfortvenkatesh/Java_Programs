package InterviewProblems;

public class moveToLeft {
    public static void main(String[] args) {
        int[] arr = {0, 5, 0, 3, 0, 2, 0, 1};
        moveZerosToLeft(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void moveZerosToLeft(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (right >= left) {
            if (arr[right] == 0) {

                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

            }
            left++;
            right--;
        }
    }
}

