
abstract class Shape {
    public abstract double area();
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
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
    public double area() {
        return 0.5 * base * height;
    }
}

public class Main {
    public static void main(String[] args) {
        // Upcasting
        Shape shape1 = new Square(5.0);
        Shape shape2 = new Circle(2.5);

        System.out.println("Area of shape1 (Square): " + shape1.area());
        System.out.println("Area of shape2 (Circle): " + shape2.area());

        // Downcasting
        Shape shape3 = new Rectangle(4.0, 6.0);
        Rectangle rectangle = (Rectangle) shape3;
        System.out.println("Area of shape3 (Rectangle): " + shape3.area());
        System.out.println("Area of rectangle: " + rectangle.area());

    }
}
