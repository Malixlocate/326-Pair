public class Sums {
    private static int n = 5000;
    private static double result = 0f;

    public static void main(String[] args) {
        if (args[0] != null) {
            n = Integer.parseInt(args[0]);
        }
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
    
}
