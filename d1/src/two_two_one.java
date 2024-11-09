public class two_two_one {
    public  static void main(String[] args){
            int x=123;
            System.out.println(reverse(x));
    }
    public  static int reverse(int x){
            boolean zero= x >= 0;
            if(!zero)
            {
                x=-1*x;
            }
            int result=0;
            while (x!=0)
            {
                int pop=x%10;
                x=x/10;
                result = result*10+pop;
            }
            if(!zero)
            {
                return -result;
            }
            return result;
    }
}
