public class Casting {

    public static void main(String[] args) {

        double monthlyDogs = 30.0/12.0;

        System.out.println(monthlyDogs);
        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs);

        int a = 30;
        int b = 12;

        System.out.println((double)a/b);

        char n = '1';
        int nI = n;
        System.out.println(nI);

        short nS = (short) n;
        System.out.println(nS);
    }
}
