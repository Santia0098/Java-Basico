public class Casting {
    public static void main(String[] args) {

        char c = 'z';
        int i1 = 250;
        double d = 301.067;
        int i2 = 100;
        int i3 = 737;
        double d1 = 298.638;

        int cI = (int) c;
        System.out.println(cI);
        short iS = (short)i1;
        System.out.println(iS);
        long iL = iS;
        System.out.println(iL);
        long dL = (long)d;
        System.out.println(dL);
        float iF = (float)i2;
        System.out.println(iF+5000.66);
        byte iB = (byte)i3;
        System.out.println(iB*100);
        long d2L = (long) d1 / 25;
        System.out.println(d2L);

    }
}
