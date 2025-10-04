package Stacks;

import java.util.*;

public class moveStackInAnotherStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        // reverse stack
        Stack<Integer> temp = new Stack<>();
        while (st.size() > 0) {
            temp.push(st.pop());
        }

        Stack<Integer> rt = new Stack<>();
        while (temp.size() > 0) {
            rt.push(temp.pop());
        }
        System.out.println(rt);
    }
}
