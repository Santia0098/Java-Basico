public class Functions {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;
        //Area of circle
        System.out.println(areaOfCircle(x));

        //Area of sphere
        System.out.println(areaOfSphere(y));

        //Volume of sphere
        System.out.println(volumeOfSphere(y));

        //Convert
        System.out.println("Pesos to Dollars: " + convertToDollars(200, "MXN"));
        System.out.println("Pesos Colombianos to Dollars: " + convertToDollars(200, "COP"));
    }

    public static double areaOfCircle(double r) {
        return (Math.PI * Math.pow(r, 2));
    }

    public static double areaOfSphere(double a) {
        return (Math.PI * 4) * (Math.pow(a, 2));
    }

    public static double volumeOfSphere(double r) {
        return (4/3*(Math.PI))*(Math.pow(r, 3));
    }

    /**
     * Description: this function allow us convert money quantity in Dollars
     * @param quantity Money
     * @param currency Type of currency: Only MXN or COP
     * @return quantity converted to Dollars
     */
    public static double convertToDollars(double quantity, String currency) {
        switch (currency) {
            case "MXN":
                quantity *= 0.052;
                break;
            case "COP":
                quantity *= 0.00031;
                break;
        }
        return quantity;
    }
}
