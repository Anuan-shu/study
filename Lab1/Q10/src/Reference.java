class Point {
    int x, y;

    void setXY(int m, int n) {
        x = m;
        y = n;
    }
}

public class Reference {
    public static void main(String[] args) {
        Point p1, p2;
        p1 = new Point();
        p2 = new Point();
        System.out.println("p1 的引用: " + p1);
        System.out.println("p2 的引用: " + p2);
        p1.setXY(1111, 2222);
        p2.setXY(-100, -200);
        System.out.println("p1 的 x, y 坐标: " + p1.x + ", " + p1.y); // 1
        System.out.println("p2 的 x, y 坐标: " + p2.x + ", " + p2.y); // 2
        p1 = p2;
        p1.setXY(0, 0);
        System.out.println("p1 的引用: " + p1);
        System.out.println("p2 的引用: " + p2);
        System.out.println("p1 的 x, y 坐标: " + p1.x + ", " + p1.y); // 3
        System.out.println("p2 的 x, y 坐标: " + p2.x + ", " + p2.y); // 4
    }
}
//1:p1 的 x, y 坐标: 1111, 2222
//2:p2 的 x, y 坐标: -100, -200
//3:p1 的 x, y 坐标: 0, 0
//4:p2 的 x, y 坐标: 0, 0

//什么是浅拷贝？什么是深拷贝？
/*
浅拷贝：对象的浅拷贝会对“主”对象进行拷贝，但不会复制主对象里面的引用类型成员变量。
深拷贝：深拷贝是一个整个独立的对象拷贝，深拷贝会拷贝所有的属性在内存中生成一个新的对象
 */

//如果你要为一个类实现 copy() 方法，思考如何避免引用间赋值导致的浅拷贝？或者说，如何确保进行的是深拷贝。
//实现Cloneable接口并重写clone()方法
//在clone()方法中，对引用类型的变量手动进行深拷贝

//解释String的 == 和 equals() 的区别。
//==是比较两个对象的地址是否相同，equals()是比较两个对象的内容是否相同。
