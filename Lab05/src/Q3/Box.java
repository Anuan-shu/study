package Q3;

public class Box<T extends Number> {
    // other fields and methods ...
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    public void set(T value) {
        this.value = value;
    }

    public static Number compareBoxes(Box<? extends Number> b1, Box<? extends Number> b2) {
        // your implementation
        if (b1.get().doubleValue() > b2.get().doubleValue()) {
            return b1.get();
        } else {
            return b2.get();
        }
    }
    // other fields and methods ...
}