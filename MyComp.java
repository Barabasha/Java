import java.util.TreeSet;

public class MyComp implements Comparable {
    private int day;
    private int month;

    private MyComp(int day, int month) {
        this.day = day;
        this.month = month;
    }

    @Override
    public int compareTo(Object obj) {
        MyComp entry = (MyComp) obj;
        int result = this.month - entry.month;
        if (result != 0) return result / Math.abs(result);
        result = this.day - entry.day;
        if (result != 0) return result / Math.abs(result);
        return 0;
    }

    public static void main(String[] args) {
        TreeSet<MyComp> ex = new TreeSet<MyComp>();
        ex.add(new MyComp(20, 11));
        ex.add(new MyComp(10, 10));
        ex.add(new MyComp(15, 11));
        ex.add(new MyComp(10, 9));

        for (MyComp e : ex) {
            System.out.println("Day: " + e.day + " Month: " + e.month);
        }
    }
}
