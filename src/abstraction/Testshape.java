package abstraction;

public class Testshape {
    public static void main(String[] args) {
        Shape circle = new Circle(4f);
        System.out.println(circle.area());

        Shape triangle = new Triangle(3f, 4f);
        System.out.println(triangle.area());

        Shape Rectangle = new Rectangle(4f,6f);
        System.out.println(Rectangle.area());

    }

}
