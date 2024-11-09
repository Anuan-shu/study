import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        System.out.println("23371234-杨陆海");
        Scanner in = new Scanner(System.in);
        String argStr;
        while (true) {
            argStr = in.nextLine();
            if (argStr.equals("QUIT")) {
                System.out.println("----- Good Bye! -----");
                System.exit(0);

            } else {
                System.out.println("Hello, World!");
            }
        }
    }

}
