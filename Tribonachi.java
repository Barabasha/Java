public class Tribonachi {
    public static void main(String[] args) {
        int n = 35;
        System.out.println("For n = " + n + " tribonacci's element = " + trib(n));
    }

    private static int trib(int n) {
        if ((n == 2) || (n == 1)) return 1;
        if (n == 3) return 2;
        return (trib(n - 1) + trib(n - 2)) + trib(n - 3);
    }
}

