package test;
//Base class
class Shape {
 double getArea() {
     System.out.println("Calculating area in Shape class...");
     return 0;
 }
}

//Subclass
class Rectangle extends Shape {
 private double length;
 private double width;

 // Constructor to initialize rectangle dimensions
 Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 // Overriding getArea method to calculate rectangle area
 @Override
 double getArea() {
     return length * width;
 }
}

//Main class to test it
public class Main {
 public static void main(String[] args) {
     Shape myShape = new Shape();
     System.out.println("Area from Shape: " + myShape.getArea());

     Rectangle myRectangle = new Rectangle(5.0, 3.0);
     System.out.println("Area of Rectangle: " + myRectangle.getArea());
 }
}
