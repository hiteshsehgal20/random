/*given an integer n, get the value of nth number in Fibonacci series*/
public class FibonacciSeries {
    private static long[] fibStore;
    public long getFibonacciByRecursion(int n) {
        if (n<=1) {
            return n;
        }
        return getFibonacciByRecursion(n-1) + getFibonacciByRecursion(n-2);
    }
    public long getFibEfficient(int n) {
        fibStore = new long[n+1];
        return getFibByMemoization(n);
    }
    private long getFibByMemoization(int n) {
        if (n<=1) {
            return n;
        }
        if (fibStore[n] != 0) {
            return fibStore[n];
        }
        long nthNumber = getFibByMemoization(n-1) + getFibByMemoization(n-2);
        fibStore[n] = nthNumber;
        return nthNumber;
    }
}
