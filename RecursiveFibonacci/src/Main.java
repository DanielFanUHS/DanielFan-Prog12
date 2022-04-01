public class Main {
    /**
     * Find nth term in the Fibonacci sequence
     * @param n term
     * @return the value of the nth term or -1 if term is invalid(n <= 0)
     */
    public static int fib(int n) {
        // return -1 if invalid term
        if(n <= 0) return -1;
        // directly return 1 for terms 1,2
        if(n <= 2) return 1;
        return fib(n-1) + fib(n-2);
    }

    /**
     * Find the sum of the first n terms of the Fibonacci sequence
     * @param n term number to add up to
     * @return the sum of the first n terms
     * eg. 5 returns 12
     */
    public static int fibSum(int n){
        int sum = 0;
        for (int i = 1; i < n+1; i++) {
            sum += fib(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(fibSum(5));
    }
}
