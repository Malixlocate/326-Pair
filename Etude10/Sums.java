public class Sums {
    private static int n = 3422;
    private static double result = 0f;

    public static void main(String[] args) {
        System.out.println(calculateFromOne());
        System.out.println(calculateFromN());
    }

    public static double calculateFromOne() {
        double result = 0f;
        for (int i = n; i > 0; i--) {
            result += (double) 1 / i;
        }
        return result;
    }

    public static double calculateFromN() {
        double result = 0f;
        for (int i = 1; i <= n; i++) {
            result += (double) 1 / i;
        }
        return result;
    }

     public static float  calculateFromN() {
        float result = 0f;
        for (int i = 1; i <= n; i++) {
            result += (float) 1 / i;
        }
        return result;
    }

    public static double calculateFromOne() {
        double result = 0f;
        for (int i = n; i > 0; i--) {
            result += (double) 1 / i;
        }
        return result;
    }


    
}
