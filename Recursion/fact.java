package Recursion;

public class fact {
    public static void main(String[] args) {
        int ans = factFive(5);
        System.out.println(ans);
    }

    static int factFive(int n) {
        if (n <= 1) {
            return 1;
        }

        return n * factFive(n - 1);
    }
}
