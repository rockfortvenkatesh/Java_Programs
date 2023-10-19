package InterviewProblems;

import java.util.Stack;

public class Greateelement {
    public static void main(String[] args) {
        int[] array = {4,5,2,25};

        Stack<Integer> stack=new Stack<>();
        stack.push(array[0]);
        int i,x;
        for(i=1;i<array.length;i++){
            if(stack.empty()){
                stack.push(array[i]);
                continue;
            }
            while (!stack.empty() && stack.peek()<array[i]){
                x=stack.peek();
                System.out.println(x+"---->"+array[i]);
                stack.pop();
            }
            stack.push(array[i]);
        }
        while(!stack.empty()){
            System.out.println(stack.pop()+"---->"+-1);
        }
    }
}
