import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int response = 0;
       do {
           System.out.println("Select an option");
           System.out.println("1. Movies");
           System.out.println("2. Series");
           System.out.println("0. Exit");
           response = x.nextInt();

           switch (response) {
               case 0:
                   System.out.println("Thnks for your visit");
                   break;
               case 1:
                    System.out.println("Movies");
                   break;
               case 2:
                   System.out.println("Series");
                   break;
               default:
                   System.out.println("Select a correct option");
                   break;
           }


       }while (response != 0);
        System.out.println("EXIT");
    }
}
