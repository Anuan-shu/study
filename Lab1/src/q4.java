public class q4 {
    static void print(String s) {
        System.out.println(s);
    }

    static boolean test1(int val) {
        print("1");
        return val < 1;
    }

    static boolean test2(int val) {
        print("2");
        return val < 2;
    }

    static boolean test3(int val) {
        print("3");
        return val < 3;
    }

    public static void main(String[] args) {
        boolean b = test1(0) && test2(2) && test3(2);
        //调用test1  test1(0)的返回值为true
        //调用test2  test2(2)的返回值为false
        //由于test2(2)返回值为false &&后连接的test3(2)不会再执行
        
        //b的值为false 输出b is false
        print("b is " + b);
    }
}
