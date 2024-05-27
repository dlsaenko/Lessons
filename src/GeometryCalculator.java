interface Shape {
    double calculatePerimeter();
    double calculateArea();
    String getBorderColor();
    String getFillColor();
}

class Circle implements Shape {
    private double radius;
    private String borderColor;
    private String fillColor;

    public Circle(double radius, String borderColor, String fillColor) {
        this.radius = radius;
        this.borderColor = borderColor;
        this.fillColor = fillColor;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }
}

class Rectangle implements Shape {
    private double width;
    private double height;
    private String borderColor;
    private String fillColor;

    public Rectangle(double width, double height, String borderColor, String fillColor) {
        this.width = width;
        this.height = height;
        this.borderColor = borderColor;
        this.fillColor = fillColor;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }
}

class Triangle implements Shape {
    private double side1;
    private double side2;
    private double side3;
    private String borderColor;
    private String fillColor;

    public Triangle(double side1, double side2, double side3, String borderColor, String fillColor) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.borderColor = borderColor;
        this.fillColor = fillColor;
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double calculateArea() {
        // Using Heron's formula to calculate area of triangle
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }
}

public class GeometryCalculator {
    public static void main(String[] args) {
        // Создаем экземпляры геометрических фигур
        Circle circle = new Circle(5, "Black", "Red");
        Rectangle rectangle = new Rectangle(4, 6, "Blue", "Yellow");
        Triangle triangle = new Triangle(3, 4, 5, "Green", "Orange");

        // Выводим характеристики каждой фигуры
        System.out.println("Circle:");
        System.out.println("Perimeter: " + circle.calculatePerimeter());
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Border Color: " + circle.getBorderColor());
        System.out.println("Fill Color: " + circle.getFillColor());
        System.out.println();

        System.out.println("Rectangle:");
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Border Color: " + rectangle.getBorderColor());
        System.out.println("Fill Color: " + rectangle.getFillColor());
        System.out.println();

        System.out.println("Triangle:");
        System.out.println("Perimeter: " + triangle.calculatePerimeter());
        System.out.println("Area: " + triangle.calculateArea());
        System.out.println("Border Color: " + triangle.getBorderColor());
        System.out.println("Fill Color: " + triangle.getFillColor());
    }
}
