
package oopproject5;


public class Triangle extends Shape {
      int base;
      int height;

    public Triangle() {
    }

    public Triangle(int base, int height, String color) {
        super(color);
        this.base = base;
        this.height = height;
    }
     @Override
     public double getarea() {
      return 0.5*base*height;
   }

    @Override
    public String toString() {
        return "Triangle{" + "base=" + base + ", height=" + height + ',' + super.toString() + '}';
    }
     
}
