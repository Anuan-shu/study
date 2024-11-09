package Q1;

public class Pair<T1, T2> {
    private T1 first;
    private T2 second;

    public Pair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }

    public void setFirst(T1 first) {
        this.first = first;
    }

    public void setSecond(T2 second) {
        this.second = second;
    }

    public T1 getFirst() {
        return first;
    }

    public T2 getSecond() {
        return second;
    }


    public void swap() {
        if (first.getClass() == second.getClass()) {
            T1 temp = first;
            first = (T1) second;
            second = (T2) temp;
        } else if (first.getClass().getSuperclass() == second.getClass().getSuperclass()) {
            T1 temp = first;
            first = (T1) second;
            second = (T2) temp;
        }
    }
}

class Parent {
    private String name;
    private int age;

    public Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Child1 extends Parent {
    public Child1(String name, int age) {
        super(name, age);
    }
}

class Child2 extends Parent {
    public Child2(String name, int age) {
        super(name, age);
    }
}

class Main {
    public static void main(String[] args) {
        Parent child1 = new Child1("child1", 10);
        Parent child2 = new Child2("child2", 20);
        Pair<Parent, Parent> pair = new Pair<>(child1, child2);
        pair.swap(); // can swap the two values
        System.out.println(pair.getFirst().getClass());
        System.out.println(pair.getSecond().getClass());

        Pair<String, Integer> another = new Pair<>("str", 114514);
        another.swap(); // do nothing
        System.out.println(another.getFirst().getClass());
        System.out.println(another.getSecond().getClass());
    }
}