public class IncrementDecrement {
    public static void main(String[] args) {

        int lives = 5;
        lives--;
        System.out.println(lives);

        lives -= 1;
        System.out.println(lives);

        lives++;
        System.out.println(lives);
        //int gift = 100 + lives++; //postfijo
        int gift = 100 + ++lives; //prefijo

        System.out.println(gift);

    }
}
