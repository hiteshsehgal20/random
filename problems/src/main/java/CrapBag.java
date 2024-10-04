

public class CrapBag {
    static long[] fib;

    static long getFib(int n) {
        if (n <= 1) {
            return n;
        }
        if (fib[n] != 0) {
            return fib[n];
        }
        long nthNum = getFib(n - 1) + getFib(n - 2);
        fib[n] = nthNum;
        return nthNum;
    }

    static long getFibBad(int n) {
        if (n <= 1) {
            return n;
        }
        return getFibBad(n - 1) + getFibBad(n - 2);
    }

    static long getFibBetter(int n) {
        if (n <= 1) {
            return n;
        }
        long curr = 0;
        long prev1 = 1;
        long prev2 = 0;
        for (int i = 2; i <= n; i++) {
            curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        return curr;
    }

    public static void main(String[] args) {
        int n = 50;
        fib = new long[n + 1];
        for (int i = 0; i < n; i++) {
            System.out.println(getFibBetter(i));
        }
        //System.out.println(getFibBad(n));

    }
}
