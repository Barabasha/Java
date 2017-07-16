public class Tribonachi_cycle {
    public static void main(String[] args) {
        int n = 10000;
        System.out.println("For n = " + n + " tribonacci's element = " + trib_cyc(n));
    }

    private static int trib_cyc(int n) {
        int[] ar;
        ar = new int[n];
        ar[0] = 1;
        ar[1] = 1;
        ar[2] = 2;
        for (int i = 3; i < n; i++) {
            ar[i] = ar[i - 1] + ar[i - 2] + ar[i - 3];
        }
        return ar[n - 1];
    }
}
