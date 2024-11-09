package Q8;

public abstract class Shape {
    protected double a;
    protected double b;

    public Shape() {
        this(0.0, 0.0);
    }

    public Shape(double a, double b) {
        this.a = a;
        this.b = b;
    }

    /**
     * calcArea
     * 计算形状的面积
     *
     * @return 面积
     */
    abstract public double calcArea();

    /* 其他必要的方法，比如 getter 和 setter */
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setA(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("a set error");
        }
        this.a = a;
    }

    public void setB(double b) {
        if (b < 0) {
            throw new IllegalArgumentException("b set error");
        }
        this.b = b;
    }

    public String toString() {
        return getClass().getSimpleName();
    }
}

class Rectangle extends Shape {

    public Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    public double calcArea() {
        return a * b;
    }
}

class Rhombus extends Shape {

    public Rhombus(double a, double b) {
        super(a, b);
    }

    @Override
    public double calcArea() {
        return a * b / 2;
    }
}

class Ellipse extends Shape {

    public Ellipse(double a, double b) {
        super(a, b);
    }

    @Override
    public double calcArea() {
        return Math.PI * a * b;
    }
}