//---------------------------polymorphism------------------------------
//------------------example of overloading-----------------------------
class polymorphism{
    void add(int a,int b){
        System.out.println("Answer of a+b is : "+ (a+b));
    }

    void add(int a, int b, int c){
        System.out.println("Answer of a+b+c is : "+(a+b+c));
    }
}
public class polymorphismOverloading {
    public static void main(String[] args) {
        polymorphism p = new polymorphism();
         p.add(9,7);
         p.add(1,4,8);
    }
}
