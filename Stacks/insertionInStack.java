package Stacks;

import java.util.*;

public class insertionInStack {
    public static void main(String[] args) {

        // insertion at bottom
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);

        Stack<Integer> rt = new Stack<>();
        while (st.size() > 0) {
            rt.push(st.pop());
        }
        System.out.println(rt);
        st.push(5);
        System.out.println(st);

        while (rt.size() > 0) {
            st.push(rt.pop());
        }
        System.out.println(st);

        // insertion in the middle

    }
}
