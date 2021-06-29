public class IfStatement {
    public static void main(String[] args) {

        boolean isBluethootEnabled = true;
        int fileSended = 3;


        if (isBluethootEnabled) {
            fileSended++;
            System.out.println("File sent");
        } else {
            fileSended--;
            System.out.println("Error to send the file, turn on bluetooth");
        }
        System.out.println(fileSended);
        System.out.println(isBluethootEnabled);
    }
}
