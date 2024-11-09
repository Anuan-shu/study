import java.util.Scanner;

public class AxB {
    public static void main(String[] args){
        String aa;
        String bb;
        char[] a;
        char[] b;
        int[] ans  = new int[3000];
        Scanner sc = new Scanner(System.in);
        aa = sc.next();
        bb = sc.next();
        a = aa.toCharArray();
        b = bb.toCharArray();
        int num=0;
        int end = 0;
        for(int i=b.length-1;i>=0;i--)
        {
            for(int j = a.length-1;j>=0;j--)
            {
                ans[num] += (a[j]-'0')*(b[i]-'0');
                num++;
                end = num;
            }
            num = b.length-i;
        }
        for(int i=0;i<end;i++)
        {
            if(ans[i]>=10)
            {
                ans[i+1]+=ans[i]/10;
                ans[i]%=10;
            }
        }
        if(ans[end]!=0)
        {
            System.out.printf("%d",ans[end]);
        }
        int flag=0;
        for(int i=end-1;i>=0;i--)
        {
            if (ans[i] != 0) {
                flag = 1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.print("0");

        }
        else
        {
            for(int i=end-1;i>=0;i--)
            {
                System.out.printf("%d",ans[i]);
            }
        }

    }
}
