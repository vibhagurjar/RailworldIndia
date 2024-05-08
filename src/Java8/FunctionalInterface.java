package Java8;
//Functional Interface- An Interface that contains exactly one abstract method is known as functional interface.

interface sayablle{
    void say(String msg);
}
public class FunctionalInterface implements sayablle{

    @Override
    public void say(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        FunctionalInterface fie = new FunctionalInterface();
        fie.say("Hello");
    }
}
