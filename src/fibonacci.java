//  1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597 ...
public class fibonacci {

    public static void main(String[] args) {
        int n = 8;
        System.out.println("For n = " + n + " fibonacci's element = " + fib(n));
    }

    static int fib(int n) {
        if ((n == 2) || (n == 1)) return 1;
        if (n == 3) return 2;
        return (fib(n - 1) + fib(n - 2));
    }
}
