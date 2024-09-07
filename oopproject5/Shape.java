
package oopproject5;


public abstract class Shape {
    String color;

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }
    public abstract double getarea();
   

    @Override
    public String toString() {
        return "Shape{" + "color=" + color + '}';
    }
    
}
