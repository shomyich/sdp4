

public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape circle = factory.createShape("circle");
        Shape square = factory.createShape("square");
        Shape triangle = factory.createShape("triangle");

        circle.draw();
        square.draw();
        triangle.draw();
    }
}
