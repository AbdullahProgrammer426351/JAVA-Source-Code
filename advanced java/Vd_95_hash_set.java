import java.util.HashSet;

public class Vd_95_hash_set {
    public static void main(String[] args) {
        /*
         * Why we have to sue hashSet instead of array?
         * Ans : Because we can search data in constant time whatever the size of the
         * list is. Hashing technique improves the search speed. To understand hashing
         * technique very well: video link is :
         * https://www.youtube.com/watch?v=JVdMD3r7dSs&list=
         * PLu0W_9lII9agS67Uits0UnJyrYiXhDS6q&index=94
         */
        HashSet<Integer> myHashSet = new HashSet<>();
        // with intial capacity of 16 and load factor of 0.75
        HashSet<Integer> hs2 = new HashSet<>(6, 9.5f);
        // we are defining intial capacity and load factor himself
        myHashSet.add(5);
        myHashSet.add(6);
        myHashSet.add(7);
        myHashSet.add(2);
        myHashSet.add(1);
        myHashSet.add(8);
        myHashSet.add(8);// if you will add a duplicate element, it will be inserted only once

        // printing hashSet on the screen
        System.out.println(myHashSet);

    }
}
