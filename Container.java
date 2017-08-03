import java.util.*;

public class Container {

    public static void main(String[] args) throws Exception {
        Create myList = new CreateContainer();
        myList.creator(15);

        for (int i = 0; i < 20; i++) {
            myList.add(i);
        }
        myList.printList();
        System.out.println(myList.get(5));
    }
}
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
interface Create {
    ArrayList<Integer> creator(int n);

    ArrayList<Integer> creator();

    void add(int num);

    List<Integer> get(int n) throws Exception;

    void printList();
}
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
class CreateContainer implements Create {
    private List<Integer> myList = new ArrayList<Integer>();
    private int sizeOfMyList;

    @Override
    public ArrayList<Integer> creator(int n) {
        sizeOfMyList = n;
        return new ArrayList<Integer>(n);
    }

    @Override
    public ArrayList<Integer> creator() {
        sizeOfMyList = 5;
        return new ArrayList<Integer>(sizeOfMyList);
    }

    @Override
    public void add(int num) {
        if (myList.size() < sizeOfMyList) {
            myList.add(num);
        } else {
            myList.remove(0);
            myList.add(num);
        }
    }

    @Override
    public List<Integer> get(int n) throws Exception {
        if (myList.size() == 0) {
            throw new Exception("Container is empty");
        }
        if (myList.size() < n) {
            return myList;
        }
        return myList.subList(myList.size() - n, myList.size());
    }

    @Override
    public void printList() {
        for (int elem : myList) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }
}

