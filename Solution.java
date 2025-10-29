import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long[] b = new long[n + 1];

            for (int i = 1; i <= n; i++) {
                b[i] = sc.nextLong();
            }

            int[] a = new int[n + 1];
            int nextNew = 1;

            for (int i = 1; i <= n; i++) {
                long diff = b[i] - (i > 1 ? b[i - 1] : 0);

                if (diff == i) {

                    a[i] = nextNew++;
                } else {

                    a[i] = a[(int) (i - diff)];
                }
            }

            for (int i = 1; i <= n; i++) {
                System.out.print(a[i]);
                if (i < n)
                    System.out.print(" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
