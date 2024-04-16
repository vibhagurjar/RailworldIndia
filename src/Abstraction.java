import java.util.*;

abstract class Shape {
    abstract void draw();
        }

 class  Rectangle extends Shape{
     @Override
     void draw() {
         System.out.println("Drawing rectangle");
     }

      static class Circle extends Shape{
         @Override
         void draw() {
             System.out.println("Drawing Circle");
         }
     }
 }


public class Abstraction {
    public static void main(String[] args) {
    Shape a = new Rectangle();
    a.draw();
    Shape b = new Rectangle.Circle();
    b.draw();
    }
}
