import java.math.BigInteger;
import java.util.Scanner;

public class BigNumberAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 读取两个大数
        BigInteger a = scanner.nextBigInteger();
        BigInteger b = scanner.nextBigInteger();

        // 计算它们的和
        BigInteger sum = a.add(b);

        // 输出结果
        System.out.println(sum);
    }
}