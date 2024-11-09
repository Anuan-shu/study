public class Student {
    void study() {
        System.out.println("I am studying Java.");
    }
}

class Exam {
    public static void main(String[] args) {
        Student student = new Student();
        student.study();
    }
}
//源文件名为：Student.java
//生成两个字节码，分别为Exam Student
//执行java Student 错误提示：在类 Student 中找不到 main 方法, 请将 main 方法定义为: public static void main(String[] args)
//执行java exam    错误提示：找不到或无法加载主类 exam
//执行java Exam.class 错误提示：找不到或无法加载主类 Exam.class
//执行java Exam    输出结果:I am studying Java.