package week3;
//Implement a Shape class with derived classes
// Circle, Rectangle, and Triangle, each having a
// method to calculate the area.
 abstract class Shape {
    abstract double calculateArea();
}

 class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}


 class Rectangle extends Shape {
    private double width;
    private double height;


    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }


    @Override
    double calculateArea() {
        return width * height;
    }
}


 class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }


    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
}


public class Question2 {
    public static void main(String[] args) {

        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);
        Shape triangle = new Triangle(3.0, 7.0);


        System.out.println("Area of the Circle: " + circle.calculateArea());
        System.out.println("Area of the Rectangle: " + rectangle.calculateArea());
        System.out.println("Area of the Triangle: " + triangle.calculateArea());
    }
}
