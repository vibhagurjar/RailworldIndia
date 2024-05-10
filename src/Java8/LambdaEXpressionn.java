package Java8;
interface  startt{
    public void show(int x,int y);
}
public class LambdaEXpressionn {
    public static void main(String[] args) {

        startt s1=(x,y)->{
            System.out.println(x*y);
        };
        s1.show(19, 7);

    }
}
