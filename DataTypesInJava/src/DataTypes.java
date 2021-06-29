public class DataTypes {
    public static void main(String[] args) {
        int n = 512345678;
        long nL = 12345678901L;
        float nF = 123.456F;
        double nD = 123.456;

        var salary = 1000;
        var pension = salary*0.03;
        var totalSalary = salary - pension;
        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        var employeeName = "Miguel";
        System.out.println("Name: " + employeeName + " total salary: " + totalSalary);

    }
}
