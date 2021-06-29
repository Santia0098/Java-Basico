public class SwitchStatement {
    public static void main(String[] args) {

        String colorModeSelected = "Dark";

        switch (colorModeSelected) {
            case "Light":
                System.out.println("Light mode selected");
                break  ;
            case "Night":
                System.out.println("Night mode selected");
                break;
            case "Blue Dark":
                System.out.println("Blue dar selected");
                break;
            case "Dark":
                System.out.println("Dark theme selected");
                break;
            default:
                System.out.println("You must to select a correct option");
        }
    }
}
