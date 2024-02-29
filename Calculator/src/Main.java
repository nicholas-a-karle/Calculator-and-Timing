

public class Main {
    public static void main(String[] args) throws Exception {
        double r = 0.42342343434 * 13.43423132 / 1001 / 0.332352232;
        System.out.println(r);
        int sigfigs = 4;

        double l = r;
        int ex = 1;
        if (sigfigs > 1) ++sigfigs;
        if (l > 10) while (l > 10) {
            l /= 10;
            ex *= 10;
        } else if (l < 1) while (l < 1) {
            l *= 10;
            ex *= 10;
        }
        System.out.println(l + " x 10 ^ " + ex);
        String s = Double.toString(l).substring(0, sigfigs) + " x 10 ^ " + ex;
        System.out.println(s);
    }
}
