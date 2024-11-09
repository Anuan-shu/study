package Q5;

public class ShapeFactory {
    public Shape makeShape(ShapeType type, double a, double b) {
        switch (type) {
            case 矩形:
                return new Rectangle(a, b);
            case 菱形:
                return new Rhombus(a, b);
            case 椭圆:
                return new Ellipse(a, b);
            default:
                return null;
        }
    }

    public Shape randomNextShape() {
        double a = Math.random() * 10;
        double b = Math.random() * 10;
        ShapeType type = ShapeType.values()[(int) (Math.random() * ShapeType.values().length)];
        return makeShape(type, a, b);
    }
}
