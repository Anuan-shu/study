public class string_code {
    public static void main(String[] args){
        String str = "Hello,world!";
        String prefix = str.substring(0,5);  // 提取前5个字符，即 "Hello"
        String suffix = str.substring(7);     // 提取从第7个字符开始的所有字符，即 "world!"
        System.out.println(prefix);
        System.out.println(suffix);
    }
    public int lengthOfLongestSubstring(String s) {
        int res=0;
        char[] c = s.toCharArray();
        for(int l=0;l<s.length();l++)
        {
            boolean[] exit = new boolean[200];
            for(int r=l;r<s.length();r++)
            {
                if(exit[c[r]])
                {
                    break;
                }
                exit[c[r]]=true;
                res = Math.max(res,r-l+1);
            }
        }
        return res;
    }
}
