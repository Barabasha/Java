import java.util.ArrayList;
import java.util.Iterator;

public class FindElementFromEnd {

    Iterator<Integer> iterator;

    private FindElementFromEnd(Iterator<Integer> iterator) {
        this.iterator = iterator;
    }

    private int getThirdElementFromTheEnd() {
        int el1 = 0,el2 = 0,el3 = 0;
        while (iterator.hasNext()) {
            el3 = el2;
            el2 = el1;
            el1 = iterator.next();
        }
        return el3;
    }
    private int getNumberElementFromTheEnd(int n, int idx_from_end){
        int [] temp_arr;
        temp_arr = new int [n];
        int i = 0;
        while (iterator.hasNext()) {
            temp_arr[i] = iterator.next();
            i++;
        }
        return temp_arr[n-idx_from_end];
    }

    public static void main(String[] args) {
        ArrayList <Integer> arr = new ArrayList<>();
        int n = 10;
        int idx_from_end = 4;
        for (int i=1; i<n+1; i++) {
            arr.add(i*i);
        }
        for (int elem : arr){
            System.out.println(elem);
        }
        Iterator<Integer> iter = arr.iterator();
        FindElementFromEnd it1 = new FindElementFromEnd (iter);
        //System.out.println("Third element from the end: "+it1.getThirdElementFromTheEnd());
        System.out.println(idx_from_end+"-element from the end: "+it1.getNumberElementFromTheEnd(n,idx_from_end));
    }
}