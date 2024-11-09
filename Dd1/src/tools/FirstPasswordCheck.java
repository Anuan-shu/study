package tools;

public class FirstPasswordCheck {
    public static String check(String password) {
        //长度为 6-16 位。
        //由英文字母（大小写均可）、数字和特殊字符（@，_，%，$）三类构成，每类至少有一个字符。

        if (!password.matches("^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[@_%$]).{6,16}$")) {
            return null;
        }
        return password;
    }
}
