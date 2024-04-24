package Exceptions;

public class NullPointerExceptionCode {
    static NullPointerExceptionCode obj = null;
    int a = 10;

    public static void main(String[] args) {

        try{
            System.out.println(obj.a);
        }catch(NullPointerException e){
            System.out.println("An Exception is Occured.");
            e.printStackTrace();
            System.out.println(e);
        }
    }
}
