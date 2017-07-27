import java.util.ArrayList;
import java.util.Collections;

public class FindAPair {
    private static ArrayList<ArrayList<Integer>> FindPairs(int number, ArrayList<Integer> list) {
        ArrayList<ArrayList<Integer>> list_pairs = new ArrayList<ArrayList<Integer>>();
        for (int elem : list) {
            for (int next_elem : list) {
                ArrayList<Integer> list_pair = new ArrayList<Integer>();
                if ((number == elem + next_elem)& next_elem>elem) {
                    list_pair.add(elem);
                    list_pair.add(next_elem);
                    list_pairs.add(list_pair);
                }
            }
        }
        return list_pairs;
    }

    public static void main(String[] args) {
        int number = 9;
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> list_pairs = new ArrayList<ArrayList<Integer>>();
        list.add(9);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(1);
        Collections.sort(list);

        for (int elem : list)
            System.out.print(elem + " ");
        System.out.println();

        list_pairs = FindPairs(number, list);
        System.out.println("For Number = "+number+"     Pairs:");
        for (ArrayList elem : list_pairs) {
            System.out.println(elem);
        }
    }
}

