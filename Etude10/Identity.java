public class Identity {

    public static void main(String[] args) {
        float f = 5f;
        float g = 10f;
        Double fd = 0d, gd = 0d;
        String mode = "f";
        Boolean result;
        if (args.length == 2) {
            f = Float.parseFloat(args[0]);
            g = Float.parseFloat(args[1]);
        } else if (args.length == 3) {
            mode = args[0];
            f = Float.parseFloat(args[1]);
            g = Float.parseFloat(args[2]);
        }

        if (mode.equals("d")) {
            fd = Double.parseDouble(args[1]);
            gd = Double.parseDouble(args[2]);
            System.out.println("Running with double precision");
            result = calcIdentity(fd, gd);
        } else {
            System.out.println("Running with single precision");
            result = calcIdentity(f, g);
        }
        
        System.out.println("Identity for " + f + " and " + g
                           + " is " + result); 
    }

    public static Boolean calcIdentity(float f, float g) {
        return f == (f/g - f * g) * g + f * g * g;
    }

    public static Boolean calcIdentity(Double f, Double g) {
        return f == (f/g - f * g) * g + f * g * g;
    }
    
}
