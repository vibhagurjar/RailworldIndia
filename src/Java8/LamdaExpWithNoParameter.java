package Java8;
interface Sayable{
    public String say();
}
public class LamdaExpWithNoParameter {
    public static void main(String[] args) {
           Sayable s=()->{
               return "I have nothing";
           };
        System.out.println(s.say());
    }
}
