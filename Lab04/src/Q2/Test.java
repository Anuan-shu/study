package Q2;

class Super {
    public static int field = 0;

    public int getField() {
        return field;
    }
}

class Sub extends Super {
    public static int field = 1;

    public int getField() {
        return field;
    }

    public int getSuperField() {
        return super.field;
    }
}

public class Test {
    public static void main(String[] args) {
        Super sup = new Sub(); // upcasting
        System.out.println("sup.field = " + sup.field +
                ", sup.getField() = " + sup.getField());
        Sub sub = new Sub();
        System.out.println("sub.field = " + sub.field +
                ", sub.getField() = " + sub.getField() +
                ", sub.getSuperField() = " + sub.getSuperField());
    }
}