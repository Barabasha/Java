import java.util.Arrays;

public class Min_numbers_of_array {

    private static int[] bubbleSort(int[] original) {
        int[] result = Arrays.copyOf(original, original.length);
        for (int i = 0; i < result.length; i++) {
            for (int j = i; j < result.length; j++) {
                if (result[i] > result[j]) {
                    result[i] = result[i] ^ result[j];
                    result[j] = result[i] ^ result[j];
                    result[i] = result[i] ^ result[j];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] ar = {1, 3, 5, 2, 9, 4, 2, 3, 11, -2, 7, 1, 9, 5};
        int [] sort_ar;
        int[] min_numbers;
        int n = 3;
        min_numbers = new int[n];
        int count = 1;
        int i = 1;
        System.out.println(Arrays.toString(ar));
        sort_ar = bubbleSort(ar);
        System.out.println(Arrays.toString(sort_ar));
        min_numbers[0] = sort_ar[0];
        while ((i < ar.length) & (count < n)) {
            if (sort_ar[i] > sort_ar[i - 1]) {
                min_numbers[count] = sort_ar[i];
                count++;
                }
            i++;
        }
        System.out.println(Arrays.toString(min_numbers));
    }
}

