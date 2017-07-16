public class Division_minus {

    public static void main(String[] args) {
        int num1;
        int num2;
        int quotient;
        int modulo;

        num1 = 7;
        num2 = 3;
        quotient = num1 - num2;
        modulo = num1;
        while (modulo > num2) {
        modulo = modulo - num2;
        }
        System.out.println("For numbers: " + num1 + " and " + num2);
        System.out.println("Quotient= " + quotient);
        System.out.println("Modulo=" + modulo);
        }


}
