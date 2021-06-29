public class MathematicOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        Functions obj = new Functions();
        //Return an integer
        System.out.println(Math.ceil(x));

        //Returns the largest (closest to positive infinity) double value that is less than or equal to the argument
        System.out.println(Math.floor(x));

        //Returns the value of the first argument raised to the power of the second argument.
        System.out.println(Math.pow(x, y));

        //Return the biggest number
        System.out.println(Math.max(x, y));


        //Area of sphere
        System.out.println((Math.PI * 4) * (Math.pow(y, 2)));

        //Volume of sphere
        System.out.println((4/3*(Math.PI))*(Math.pow(y, 3)));
    }
}
