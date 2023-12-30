package javadz1N1;
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Площадь круга = " + circle.calculateArea());
        System.out.println("Периметер круга = " + circle.calculatePerimeter());
        System.out.println("______________________");
        Rectangle rectangle = new Rectangle(7, 3);
        System.out.println("Площадь прямоугольника = " + rectangle.calculateArea());
        System.out.println("Периметер прямоугольника = " + rectangle.calculatePerimeter());
        System.out.println("______________________");
        Rectangle square = new Square(10);
        System.out.println("Площадь квадрата = " + square.calculateArea());
        System.out.println("Периметер квадрата = " + square.calculatePerimeter());
    }
}