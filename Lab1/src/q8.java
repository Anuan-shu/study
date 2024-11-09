import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        while (true) {
            n = sc.nextInt();
            int num = 1;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(" " + num++);
                }

                System.out.println();
            }
        }
    }
}
