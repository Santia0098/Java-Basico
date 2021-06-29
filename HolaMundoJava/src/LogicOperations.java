public class LogicOperations {
    public static void main(String[] args) {

        int a = 8;
        int b = 5;

        //Asignation operators
        System.out.println("a have the same valor that b? -> " + (a == b));
        System.out.println("a have the same valor that b? -> " + (a != b));

        //Relational operators
        System.out.println("a is biggest that b? -> " + (a > b));
        System.out.println("a is least that b? -> " + (a < b));
        System.out.println("" + (a >= b));
        System.out.println("" + (a <= b));

        if (a == b) {
            System.out.println("a es = a b?");

        }else if ((a != b) && (a < b)){
            System.out.println("a es diferente a b?");

        } else if (a > b) {
            System.out.println("a es mayor a b?");


        } else if (a < b) {
            System.out.println("a es menor a b?");

        } else if (a >= b) {
            System.out.println("a es mayor o igual a b?");

        } else if (a <= b) {
            System.out.println("a es menor o igual a b?");
        }
    }
}
