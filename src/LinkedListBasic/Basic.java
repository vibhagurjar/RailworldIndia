package LinkedListBasic;
import java.util.*;
public class Basic {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList();

        l.add(5);
        l.add(10);
        l.add(20);
        l.add(29);
        l.add(43);

        System.out.println(l);

        l.removeLast();
        l.addFirst(3);

        System.out.println(l);

        LinkedList<Integer> l1 = new LinkedList();

        l1.add(25);
        l1.add(120);
        l1.add(240);
        l1.add(229);
        l1.add(437);

        System.out.println(l.containsAll(l1));

        l.addAll(l.size(), l1);

        System.out.println(l);

        System.out.println(l.contains(120));
        l.remove(6);
        System.out.println(l);

        l.removeAll(l1);
        System.out.println(l);

        // Returns head element of the LL
        System.out.println(l.element());

        System.out.println(l.get(3));

        Object arr[] = l.toArray();

        System.out.println(arr.length);

        System.out.println(l.hashCode());

        System.out.println(l.indexOf(10));

        l.add(10);
        System.out.println(l);
        System.out.println(l.lastIndexOf(10));

        boolean b = l.isEmpty();
        System.out.println(b);

        String str =
                l.toString();

        System.out.println(str);
        System.out.println(str.length());

        // Checking Data Type
        System.out.println(str.getClass().getName());

        l.pop();
        System.out.println(l);
        l.push(66);
        System.out.println(l);
    }
}
