package tools;

public class TypeCheck {
    public static boolean check(String type) {
        //只能是 "Student"、"Teacher" 或 "Administrator"
        if (!type.equals("Student") && !type.equals("Teacher") && !type.equals("Administrator")) {
            return false;
        }
        return true;
    }
}
