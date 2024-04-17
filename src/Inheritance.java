class Animal1{
    void walk(){System.out.println("walking...");}
}
class Dog1 extends Animal{
    void bark(){System.out.println("barking...");}
}
class Cat extends Animal{
    void meow(){System.out.println("meowing...");}
}
class Inheritance{
    public static void main(String args[]){
        Cat c=new Cat();
        c.meow();
    }
}

