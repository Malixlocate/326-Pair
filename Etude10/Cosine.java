import java.util.Scanner;


public class Cosine {
    


    public static void main(String[] args) {
        System.out.println(solve());
        System.out.println(Math.cos(0.998));
    }
    
    public static Double solve() {
        //1 - x/2! + x/4! - x/8! ...
        Double denom = 2d;
        Boolean minus = true;
        Double ans = 1.0;
        Double x = 0.998;
        for (int i = 0; i < 5000; i++) {
            if (minus) ans -= Math.pow(x, denom) / factorial(denom);
            else ans += Math.pow(x, denom) / factorial(denom);
            System.out.println(denom);
            denom += 2;
            minus = !minus;
        }
        return ans;
    }

    public static Double factorial(Double in) {
        Double ans = in;
        for (Double i = in; i > 2; i--) {
            ans *= (i - 1);
        }
        return ans;
    }
    
}
