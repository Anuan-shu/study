package tools;

public class NameCheck {
    public static boolean check(String name) {
        //正则表达式由英文字母（大小写均可）和下划线两类组成，不要求两类字符至少出现一次。
        //第一位不能为下划线。
        //长度在 4-16 字符之间。
        if (name.length() < 4 || name.length() > 16) {
            return false;
        }
        if (!name.matches("^[a-zA-Z][a-zA-Z_]*$")) {
            return false;
        }
        return true;
    }
}
