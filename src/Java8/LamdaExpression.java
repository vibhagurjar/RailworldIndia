package Java8;
interface start{
    public void show(int x,int y);
}
public class LamdaExpression {
    public static void main(String[] args) {
//        int x= 12;
//        int y=10;
        start s = (x,y)->{
            System.out.println(x*y);
        };
        s.show(12,3);

    }
}
