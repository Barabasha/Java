
public class digits {

    public static void main(String[] args) {
        int number = 87326178;
        dig(number);
    }

    static void dig(int number) {
        if (number == 0) return;
        System.out.print(number % 10);
        dig(number / 10);
        return;
    }


}
