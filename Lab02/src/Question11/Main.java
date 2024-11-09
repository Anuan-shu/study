package Question11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (UnsignInt(str)) {
            System.out.println("是没有前导0的无符号整数");
            if (HuiWeng(str)) {
                System.out.println("是回文数");
            } else {
                System.out.println("不是回文数");
            }
        } else {
            System.out.println("不是没有前导0的无符号整数");
        }
    }

    public static boolean UnsignInt(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        if (str.length() == 1) {
            return true;
        }
        if (str.charAt(0) == '0') {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }

    public static boolean HuiWeng(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        int len = str.length();
        if (str.charAt(len - 1) == '0') {
            return false;
        }
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
