
import java.util.*;

public class Vd_91_Array_list {
    public static void main(String[] args) {
        // ArrayList is a Collections framework class located in utils package as shown
        // in import statement
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);// specifiying the capacity(length) of the array list
        l1.add(5);
        l1.add(5);
        l1.add(5);
        l1.add(5);
        l1.add(5);
        l1.add(5);

        l2.add(12);
        l2.add(12);
        l2.add(12);

        l2.clear();// clears all the data in arraylist
        l1.contains(55); // returns true if given value is present in arraylist, otherwise it will return
                         // false

        l1.indexOf(4); // it will return the index of given value
        // and it the value is not present in list, it will return -1

        l2.add(12);
        l2.add(12);

        l1.add(0, 5); // inserting at specific index
        l1.add(6);

        l1.addAll(l2);

        // traversal of arraylist
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }
    }
}
