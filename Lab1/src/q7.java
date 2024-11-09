public class q7 {
    public static void main(String[] args) {
        char c = '\0';
        for (int i = 1; i <= 4; i++) {
            switch (i) {
                case 1:
                    c = 'J';
                    System.out.print(c);
                case 2:
                    c = 'e';
                    System.out.print(c);
                    break;
                case 3:
                    c = 'p';
                    System.out.print(c);
                default:
                    System.out.print("好");
            }
        }
    }
}
//结果：Jeep好好
//i=1时 执行case 1 因为case 1中没有break语句，在输出J后继续进入case 2中输出e，之后遇到break退出switch
//i=2时 执行case 2 输出e，之后遇到break退出switch
//i=3时 执行case 3 输出p，再执行default输出好
//i=4时 执行default输出好