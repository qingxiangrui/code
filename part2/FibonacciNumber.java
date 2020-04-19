package part2;

public class FibonacciNumber {
    public int fib(int N) {
        if (N <= 1) return N;

        int prepre = 0;
        int pre = 1;
        int cur = 0;
        for (int i = 0; i < N - 1; i++) {
            cur = prepre + pre;

            prepre = pre;
            pre = cur;
        }
        return cur;
    }
}
