package Q7;

interface Inter {
    void show();
}

class Outer {
    public static Inter method() {
        return () -> System.out.println("DuluDulu");
    }
}

public class Test {
    public static void main(String[] args) {
        Outer.method().show();
    }
}