public class UpdatingVariables {

    public static void main(String[] args) {
        int salary = 1000;

        //bono 200
        salary += 200;
        System.out.println(salary);

        //50 de pension
        salary -= 50;
        System.out.println(salary);

        //2 horas extra 30 c/u
        //Comida 45.00
        salary += (30*2) - 45;
        System.out.println(salary);

        //Update strings
        String employeeName = "Miguel";

        employeeName += " Santiago";

        System.out.println(employeeName);
    }
}
