package Java8;

interface Walkable{
    public void run();
}
public class UseLamdaExp {
    public static void main(String[] args) {
        int width = 10;
        Walkable w = ()->{
            System.out.println("Output : "+width);
        };
        w.run();
    }
}
