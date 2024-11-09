package Q5;

public class Test {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape[] shapes = new Shape[5];
        for (int i = 0; i < 5; i++) {
            shapes[i] = factory.randomNextShape();
        }
        for (Shape shape : shapes) {
            System.out.println(shape.getClass().getSimpleName() + " " + shape.calcArea());
        }
    }
}
