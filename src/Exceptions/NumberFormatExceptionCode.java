package Exceptions;

public class NumberFormatExceptionCode {

    private static final String input = "123.45";
    public static void main(String[] args) {

        try{
            int a = Integer.parseInt(input);
        }catch(NumberFormatException e){
            System.out.println("Invalid String in argument.");
            e.printStackTrace();
            System.out.println(e);

        }
    }
}
