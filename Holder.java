public class Holder<T extends Number> {
    private T[] arr;
    private Integer sizeArr;
    private float averArr;
    private Number sumArr;
    private T maxArr;

    private Holder(T[] arr) {
        this.arr = arr;
    }

    private int Size() {
        sizeArr = arr.length;
        return sizeArr;
    }

    private Number Sum() {
        sumArr = 0;
        for (T elem : arr) {
            sumArr = elem.floatValue() + sumArr.floatValue();
        }
        return sumArr;
    }

    private float Aver() {
        if (sumArr == null) {
            Sum();
        }
        averArr = (float) sumArr / sizeArr;
        return averArr;
    }

    private Number Max() {
        maxArr = arr[0];
        for (T elem : arr) {
            if (elem.floatValue() > maxArr.floatValue()) {
                maxArr = elem;
            }
        }
        return maxArr;
    }

    public static void main(String[] args) {
        Number[] arr = {1, 2, 3, 4, 6, 8, 23, 65, 12, 9, 3, 5.1};
        Holder<Number> my_arr = new Holder<>(arr);
        System.out.println("SizeArr=" + my_arr.Size());
        System.out.println("AverArr=" + my_arr.Aver());
        System.out.println("SumArr" + my_arr.Sum());
        System.out.println("MaxArr=" + my_arr.Max());
    }
}

