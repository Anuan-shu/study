package Question06;

public class test {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setA(1);
        rectangle.setB(2);

        Rhombus rhombus = new Rhombus();
        rhombus.setA(3);
        rhombus.setB(4);

        Ellipse ellipse = new Ellipse();
        ellipse.setA(5);
        ellipse.setB(6);

        System.out.println(rectangle.calcArea());
        System.out.println(rhombus.calcArea());
        System.out.println(ellipse.calcArea());
    }
}
