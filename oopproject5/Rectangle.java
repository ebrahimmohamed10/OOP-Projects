
package oopproject5;


public class Rectangle extends Shape {
    int length;
    int width;

    public Rectangle() {
    }

    public Rectangle(int length, int width, String color) {
        super(color);
        this.length = length;
        this.width = width;
    }
@Override
    public double getarea()
    {
       return length * width; 
    }

    @Override
    public String toString() {
        return "Rectangle{" + "length=" + length + ", width=" + width + ',' + super.toString() + '}';
    }

    
    
    
}
