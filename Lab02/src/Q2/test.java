package Q2;

public class test {
    public static void main(String[] args) {
        Overload t = new Overload(5);
        //如果没有定义任何构造方法，编译器会自动提供一个默认的无参构造方法。
        // 但是，如果定义了一个或多个构造方法（如带参数的构造方法），编译器将不会再自动生成无参构造方法。
        // 在这种情况下，如果需要无参构造方法，必须显式地定义它。
    }
}
