import java.util.Scanner;


public class Cosine {
    


    public static void main(String[] args) {
        System.out.println("Float:  " + Fsolve());
        System.out.println("Double: " + Dsolve());
    }
   
    public static double Dsolve() {
        //1 - x/2! + x/4! - x/8! ...
        Double denom = 1d;
        Boolean minus = true;
        Double ans = 1.0;
        Double x = 0.995;
        for (int i = 0; i < 5000; i++) {
            if (minus) ans -= Math.pow(x, denom) / Dfactorial(denom);
            else ans += Math.pow(x, denom) / Dfactorial(denom);
            denom += 2;
            minus = !minus;
        }
        return ans;
    }

 public static float Fsolve() {
        //1 - x/2! + x/4! - x/8! ...
        float denom = 1f;
        Boolean minus = true;
        float ans = 1.0f;
        float x = 0.998f;
        for (int i = 0; i < 5000; i++) {
            if (minus) ans -= Math.pow(x, denom) / Ffactorial(denom);
            else ans += Math.pow(x, denom) / Ffactorial(denom);
            denom += 2;
            minus = !minus;
        }
        return ans;
    }

   

    public static double Dfactorial(double in) {
        double ans = in;
        for (double i = in; i > 2; i--) {
            ans *= (i - 1);
        }
        return ans;
    }

    public static float Ffactorial(float in) {
        float ans = in;
        for (float i = in; i > 2; i--) {
            ans *= (i - 1);
        }
        return ans;
    }
    
}
