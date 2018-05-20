import java.util.Scanner;


public class Cosine {
    


    public static void main(String[] args) {
        Double x = 12.345;
        System.out.println("Our result: " + solve(x));
        System.out.println("Our result better: " + betterSolve(x));
        System.out.println("Math lib result: " + Math.cos(x));
    }
    
    public static Double solve(Double x) {
        //1 - x/2! + x/4! - x/8! ...
        Double denom = 2d;
        Boolean minus = true;
        Double ans = 1.0;
        for (int i = 0; i < 5000; i++) {
            if (minus) ans -= Math.pow(x, denom) / factorial(denom);
            else ans *= -Math.pow(x, denom) / factorial(denom);
            System.out.println(ans);
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

    public static Double betterSolve(Double x) {
        Double ans = 1d;
        Double prev = 1d;
        for (int i = 5000; i >= 1; i++) {
            ans = -(Math.pow(x, 2) / (2*i)*(2*i - 1) * ans);
            //prev = ans;
        }
        return ans;
    }
}
