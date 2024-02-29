public class MathFunctions {
    
    public static double add(double in1, double in2) {
        return in1 + in2;
    }

    public static double sub(double in1, double in2) {
        return in1 - in2;
    }

    public static double mul(double in1, double in2) {
        return in1 * in2;
    }

    public static double div(double in1, double in2) {
        return in1 / in2;
    }

    public static String positionRound(double raw, int roundFactor/* , boolean roundBanker, boolean roundDown, boolean roundUp, boolean roundStandard*/) {
        int roundValue = (int) Math.pow(10, roundFactor);
        double l = raw * roundValue;

        int i = (int) l;

        /*
        if (roundBanker) {
            if ((i > 0.5) || (i == 0.5 && l % 2 == 1)) ++i;
        } else if (roundDown) {
            //do nothing
        } else if (roundUp) {
            ++l;
        } else if (roundStandard) {
            if (i >= 0.5) ++l;
        }
        */
        if (i >= 0.5) ++l;
        return Double.toString(l / roundValue);
    }

    public static String sciRound(double raw, int sigfigs) {
        double l = raw;
        int ex = 0;
        if (l > 10) while (l > 10) {
            l /= 10;
            ++ex;
        } else if (l < 1) while (l < 1) {
            l *= 10;
            --ex;
        }

        if (sigfigs > 1) ++sigfigs;

        return Double.toString(l).substring(0, sigfigs) + " x 10 ^ " + ex;
    }

}
