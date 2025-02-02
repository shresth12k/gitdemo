public class interestcalc {
    public int interest(int P, int R, int T) {
        int si = (P * R * T) / 100;
        return si;
    }

    public static void main(String args[]) {
        interestcalc inter = new interestcalc();
        int result = inter.interest(1000, 5, 2);
        System.out.print(result);
    }

}
