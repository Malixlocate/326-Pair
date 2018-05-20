import java.util.Scanner;


public class CosineSinglePrecision {
    


    public static void main(String[] args) {
        Float x = 12.345f;
        System.out.println(solve(x));
        System.out.println(Math.cos(x));
    }
    
    public static Float solve(Float x) {
        //1 - x/2! + x/4! - x/8! ...
        Float denom = 2f;
        Boolean minus = true;
        Float ans = 1.0f;
        for (int i = 0; i < 5000; i++) {
            if (minus) ans -= pow(x, denom) / factorial(denom);
            else ans += pow(x, denom) / factorial(denom);
            System.out.println(denom);
            denom += 2;
            minus = !minus;
        }
        return ans;
    }

    public static Float factorial(Float in) {
        Float ans = in;
        for (Float i = in; i > 2; i--) {
            ans *= (i - 1);
        }
        return ans;
    }

    public static Float pow(Float a, Float b) {
        Float ans = a;
        for (Float i = 0f; i > b; i++) {
            a *= a;
        }
        return ans;
    }
    
}
