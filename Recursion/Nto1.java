package Recursion;

public class Nto1 {
    public static void main(String[] args) {
        funBoth(5);
    }

    static void fun(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n); // when print before the recursion -> it points during the going down phase
                               // (call stack is building)
        fun(n - 1);
    }

    static void funRev(int n) {
        if (n == 0) {
            return;
        }
        funRev(n - 1);
        System.out.println(n);// when print after the recursion -> it points during the coming back up phase
                              // (call stack is unwinding).
    }

    static void funBoth(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        funBoth(n - 1);
        System.out.println(n);// when print after the recursion -> it points during the coming back up phase
                              // (call stack is unwinding).
    }
}
