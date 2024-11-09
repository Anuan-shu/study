package Q8;

public class ShapeSequence {
    private Shape[] shapes;
    private int ShapeIndex = 0;

    public ShapeSequence(int size) {
        if (size < 0) {
            size = 0;
        }
        shapes = new Shape[size];
    }

    public void add(Shape shape) {
        if (shapes.length == ShapeIndex) {
            return;
        }
        shapes[ShapeIndex++] = shape;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < ShapeIndex; i++) {
            sb.append(shapes[i].getClass().getSimpleName());
            if (i != ShapeIndex - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public SequenceIterator iterator() {
        return new SequenceIterator();
    }

    private class SequenceIterator implements Iterator {
        private int index = 0;

        public boolean isEnd() {
            return index == shapes.length;
        }

        public Shape current() {
            if (isEnd()) {
                throw new IndexOutOfBoundsException("isEnd非法访问");
            }
            return shapes[index];
        }

        public void moveNext() {
            if (isEnd()) {
                return;
            }
            index++;
        }

        public boolean equals(Object o) {
            if (!(o instanceof SequenceIterator)) {
                return false;
            }

            if (!(o == this)) {
                return false;
            }

            if (!(((SequenceIterator) o).index == index)) {
                return false;
            }
            return true;
        }
    }
}
