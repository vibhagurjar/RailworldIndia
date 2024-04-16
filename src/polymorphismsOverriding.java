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
public class polymorphismsOverriding{
    public static void main(String[] args) {
        Animal a;
        a = new Animal();
        a.sound();
        a = new Pig();
        a.sound();
        a = new Dog();
        a.sound();
    }
}
