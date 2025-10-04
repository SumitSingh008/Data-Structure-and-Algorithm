package Stacks;

import java.util.*;

public class basicsOfStacks {
    public static void main(String[] args) {

        // AISE HUM LOG ALG ALG TRH KI ARRAYLIST BNATE HAI

        // ArrayList<Integer> arr = new ArrayList<>();
        // ArrayList<String> str = new ArrayList<>();
        // ArrayList<Boolean> bool = new ArrayList<>();
        // ArrayList<Double> doub = new ArrayList<>();
        // ArrayList<Float> floa = new ArrayList<>();
        // ArrayList<Long> lon = new ArrayList<>();
        // ArrayList<Character> cha = new ArrayList<>();
        // ArrayList<Object> obj = new ArrayList<>();\

        // AB STACK KI BAAT KRTE HAI
        Stack<Integer> stack = new Stack<>();

        // PUSH OPERATION
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);

        // PEEK OPERATION
        System.out.println(stack.peek()); // 5 shows the topmost element kyuki stack LIFO hota hai mtlb last in first
                                          // out

        // POP OPERATION
        System.out.println(stack.pop()); // 5 removes the topmost element
        System.out.println(stack);

        System.out.println(stack.size()); // 2 shows the size of the stack
        System.out.println(stack.isEmpty()); // false

        while (stack.size() > 1) {
            stack.pop();
        }
        System.out.println(stack.peek());
        System.out.println(stack);

        // stack is of generic type so we can make stack of any data type
        // stack is also of dynamic size means we can push any number of elements in it
        // stack is also of collection framework so we can use all the methods of
        // collection framework in it like size(), isEmpty(), clear(), etc.
        // stack is also of iterable so we can use for each loop in it
        // stack is also of serializable so we can serialize it
    }
}
