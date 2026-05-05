import java.util.Random;

class SnakeLadder {
    public static void main(String[] args) {
        int position = 0;
        Random rand = new Random();

        while (position < 100) {
            int dice = rand.nextInt(6) + 1;
            position += dice;

            if (position > 100) {
                position -= dice;
            }

            // Ladder
            if (position == 10)
                position = 30;
            if (position == 20)
                position = 50;

            // Snake
            if (position == 40)
                position = 5;
            if (position == 70)
                position = 25;

            System.out.println("Dice: " + dice + " Position: " + position);
        }

        System.out.println("You reached 100! 🎉");
    }
}
