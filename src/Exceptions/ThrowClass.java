package Exceptions;

public class ThrowClass {
    void div(int a, int b){
        if(b==0){
            throw new ArithmeticException();
        }else{
            int c = a/b;
            System.out.println(c);
        }
    }
    public static void main(String[] args) {
        ThrowClass t = new ThrowClass();
        t.div(20,0);
    }
}
