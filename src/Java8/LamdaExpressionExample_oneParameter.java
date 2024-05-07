package Java8;

interface dead{
    public void die(int x);
}
public class LamdaExpressionExample_oneParameter {
    public static void main(String[] args) {
        dead dd=(x)->{
            System.out.println("One parameter is: "+x);
        };
        dd.die(22);
    }
}
