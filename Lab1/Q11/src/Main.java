public class Main {
    /**
     * 将任意个字符串顺序连接，不应该改变任意一个原有参数
     *
     * @param args 字符串们
     * @return args中的字符串顺序连接组成的新字符串
     */
    public static String strscat(String... args) {
        String str = "";
        for (String s : args) {
            str += s;
        }
        return str;
    }

//    static String strscat(String[] args) {
//        String str = "";
//        for (String s : args) {
//            str += s;
//        }
//        return str.toString();
//    }
}
