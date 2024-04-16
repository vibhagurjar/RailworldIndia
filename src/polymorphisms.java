//--------------------Polymorphism------------------------------------------
//----------------------- example of method overridding---------------------
class Animal {
    void sound(){
        System.out.println("In Animal's class");
    }
}
class Pig extends Animal{
    void sound(){
        System.out.println("In Pig's Sound class");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("In Dog's sound class");
    }
}
public class polymorphisms{
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();
        Animal p = new Pig();
        p.sound();
        Animal d = new Dog();
        d.sound();
    }
}
