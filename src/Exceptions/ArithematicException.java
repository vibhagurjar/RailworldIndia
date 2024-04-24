package Exceptions;

public class ArithematicException {
    public static void main(String[] args) {
        int a = 2;
        int b = 0;
        try {
            int c = a/b;
            System.out.println("The answer is : "+c);

        }catch(ArithmeticException e){
            System.out.println("An exception is occured.");
            e.printStackTrace();
            System.out.println(e);
        }
    }
}
