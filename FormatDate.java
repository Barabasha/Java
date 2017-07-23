import java.time.LocalDate;
public class FormatDate {
    public static void main(String[] args) {
       // LocalDate date = LocalDate.of(2017, 7, 17);
        LocalDate date = LocalDate.of(2017, 7, 17);

        // Output must be 17 July 2017
        System.out.println(String.format("%1$te %1$tB %1$tY", date));
    }
}

