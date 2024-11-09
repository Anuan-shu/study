package Q8;

public interface Iterator {
    int index = 0;

    boolean isEnd();

    Shape current();

    void moveNext();

    boolean equals(Object o);
}
