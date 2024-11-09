package Q4;

import java.util.LinkedList;

public class MyDeque<T> {
    private final LinkedList<T> elements;

    public MyDeque() {
        this.elements = new LinkedList<>();
    }

    public void addFirst(T element) {
        this.elements.addFirst(element);
    }

    public void addLast(T element) {
        this.elements.addLast(element);
    }

    public T removeFirst() {
        return this.elements.removeFirst();
    }

    public T removeLast() {
        return this.elements.removeLast();
    }
}