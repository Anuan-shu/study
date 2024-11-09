package tools;

public class SecondPasswordCheck {
    public static boolean check(String password, String lastPassword) {
        if (!password.equals(lastPassword)) {
            return false;
        }
        return true;
    }
}
