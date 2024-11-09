package Q8;

public class Test {
    public static void main(String[] args) {
        Shape a = new Rectangle(3, 4);
        Shape b = new Rhombus(3, 4);
        ShapeSequence sequence = new ShapeSequence(5);
        sequence.add(a);
        sequence.add(b);
        sequence.add(new Rectangle(4, 5));
        System.out.println(sequence.toString());
        sequence.add(new Rhombus(5, 6));
        sequence.add(new Rectangle(6, 7));
        sequence.add(new Rhombus(7, 8));
        System.out.println(sequence.toString());

        Iterator iterator = sequence.iterator();
        System.out.println(iterator.equals(iterator));
        while (!iterator.isEnd()) {
            System.out.println(iterator.current());
            iterator.moveNext();
        }
    }
}
