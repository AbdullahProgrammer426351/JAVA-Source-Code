import java.util.ArrayDeque;

public class Vd_93_Array_Deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        // empty constructor will make it length 16(because it uses an array)

        ad1.add(4);// ad at the last element by default
        ad1.add(49);
        ad1.add(49);
        ad1.add(46);
        ad1.addFirst(50);// ad at the first index
        ad1.addLast(49);// ad at the last index
        System.out.println("first element : " + ad1.getFirst());
        System.out.println("last element : " + ad1.getLast());
    }
}
