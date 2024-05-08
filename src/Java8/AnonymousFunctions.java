package Java8;
//anonymous function
//syntax -  (parameter)->{body}

import java.util.ArrayList;
import java.util.List;

public class AnonymousFunctions {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("Apple");
        l.add("Mango");
        l.add("Grapes");
        l.add("Banana");
        l.add("cherry");

//        l.sort((f1,f2)->f1.compareTo(f2));
        l.sort((f3,f5)->f3.compareTo(f5));

        for(String fruit:l){
            System.out.println(fruit);
        }
    }

}
