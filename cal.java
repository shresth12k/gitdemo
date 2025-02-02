import java.net.CacheRequest;

public class cal{
    public int calc{int a,int b}{
        int sum=a+b;
        return sum;
    }
    public static void main(String args[]){
        int a=10;
        int b=20;
        cal c=new cal();
        int result=c.calc(a,b);
        System.out.print(result);
    }
}