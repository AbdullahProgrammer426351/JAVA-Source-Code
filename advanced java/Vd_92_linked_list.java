import java.util.*;

public class Vd_92_linked_list {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();// we cannot give initial capacity to linked list
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

        // methods that are not in arraylist but in linkedlist

        l1.addLast(88);// insert element at the lasts
        l1.addFirst(8);// insert element at the start
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }
    }
}
