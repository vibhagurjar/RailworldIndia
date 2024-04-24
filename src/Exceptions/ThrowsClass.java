package Exceptions;

public class ThrowsClass {
    void div(int a, int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException();
        }else{
            int c = a/b;
            System.out.println(c);
        }
    }
    public static void main(String[] args) {
        ThrowClass t = new ThrowClass();
        try {
            t.div(20,0);
        }catch(Exception e){
            System.out.println("Value of second parameter is 0");
        }
    }
}
