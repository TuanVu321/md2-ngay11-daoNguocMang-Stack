import com.sun.org.apache.xalan.internal.xsltc.compiler.util.StringStack;

import java.util.Stack;

public class Reverse {
    public static void reverseNumber(int[] arr){
        Stack<Integer> stack = new Stack<Integer>();
        changeInt(arr, stack);
    }

    private static void changeInt(int[] arr, Stack<Integer> stack) {
        for(int i=0;i<arr.length;++i){
            stack.push(arr[i]);
        }
        for(int i=0;i<arr.length;++i){
            arr[i]=stack.pop();
        }
        for(int i=0;i<arr.length;++i){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void reverseString(String string){
        Stack<String> stack = new Stack<String>();
        String[] arr = string.split("");
        changeString(stack, arr);
    }

    private static void changeString(Stack<String> stack, String[] arr) {
        for(int i=0;i<arr.length;++i){
            stack.push(arr[i]);
        }
        for(int i=0;i<arr.length;++i){
            arr[i]=stack.pop();
        }
        for(int i=0;i<arr.length;++i){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}
