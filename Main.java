package Lab;
class Shape {
    int numSides;
    Shape() {
        numSides = 0;
    }
    public double getArea() {
        return 0.0;
    }
    public double getPerimeter() {
        return 0.0;
    }
}

class Rectangle extends Shape {
    double width, height;
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        numSides = 4;
    }
    @Override
    public double getArea() {
        return width * height;
    }
    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}

class Triangle extends Shape {
    double base, height;
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
        numSides = 3;
    }
    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
    @Override
    public double getPerimeter() {
        return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 10);
        Triangle tri = new Triangle(5, 10);
        System.out.println("Rectangle area: " + rect.getArea());
        System.out.println("Rectangle perimeter: " + rect.getPerimeter());
        System.out.println("Triangle area: " + tri.getArea());
        System.out.println("Triangle perimeter: " + tri.getPerimeter());
    }
}
