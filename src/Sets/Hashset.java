package Sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Spliterator;

public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(11);
        set.add(13);
        set.add(100);
        set.add(2);
        set.add(1);
        set.add(67);
        set.add(56);
        set.add(2);
        set.add(33);

        System.out.println("After adding elements to hashset-");
        System.out.println(set);

        System.out.println("Using Iterator- ");
        Iterator<Integer> i = set.iterator();
        while(i.hasNext()){
            System.out.print(i.next()+" ");
        }
        System.out.println();
        System.out.println("Size of set is-"+set.size());
        set.remove(33);
        System.out.println("After removing 33 set is-");
        System.out.println(set);

        Set<Integer>s1 = new HashSet<>();
        s1.add(33);
        s1.add(56);
        s1.add(2);
        s1.add(1);
        set.add(13);

        set.addAll(s1);
        System.out.println(set);

        System.out.println(set.equals(s1));

        System.out.println(set.containsAll(s1));

        System.out.println(s1.isEmpty());

        String str = set.toString();
        System.out.println(str.length());
//        System.out.println(set.getClass().getName());

    }
}
