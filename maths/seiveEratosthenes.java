public class seiveEratosthenes {
    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n + 1];
        seive(n, primes);
    }

    static void seive(int n, boolean[] primes) {
        for (int i = 2; i * i <= n; i++) {
            if (!primes[i]) {

            }
        }
    }
}
