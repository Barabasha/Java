import java.util.Arrays;
public class Del_num_from_array {

    public static int [] del_num(int[] ar, int idx){
        int [] del_ar ;
        del_ar = new int[ar.length-1];
        for (int i=0; i<idx; i++) {
            del_ar[i] = ar[i];
        }
        for (int i=idx+1; i<ar.length; i++) {
            del_ar [i-1] = ar[i];
        }
        return del_ar;
    }

    public static void main(String[] args) {
        int [] ar = {1, 3, 5, 2, 9, 4, 2, 3, 11, -2, 7, 1, 9, 5};
        int idx = 5;
        System.out.println(Arrays.toString(ar));
        System.out.println(Arrays.toString(del_num(ar,idx)));
    }
}
