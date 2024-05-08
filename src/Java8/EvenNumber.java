package Java8;

import java.util.Scanner;

interface findEvenNum{
    public boolean even(int x);
}
public class EvenNumber {
    public static void main(String[] args) {

        findEvenNum e = (n)-> n%2==0;
//        System.out.println("Number is even : " +e.even(4));
//        System.out.println("Number is not even : "+e.even(7));

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean result = e.even(n);
        System.out.println("Number "+n+" is even ? "+result);

    }
}
