<<<<<<< HEAD
public class Main{
    public static void main(String[] args) {
        System.out.println("Hello World");
=======
class Main  { 
    public int cal(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String args[]) {
        int a = 10;
        int b = 20;
        Main c = new Main();
        int result = c.cal(a, b);
        System.out.print(result);
>>>>>>> cal
    }
}