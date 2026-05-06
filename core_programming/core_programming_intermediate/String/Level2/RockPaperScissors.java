package core_programming.core_programming_intermediate.String.Level2;

import java.util.Scanner;
import java.util.Random;

class RockPaperScissors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        String[] options = { "rock", "paper", "scissors" };

        String user = sc.next();

        String computer = options[r.nextInt(3)];

        System.out.println("Computer: " + computer);

        if (user.equals(computer)) {

            System.out.println("Draw");

        } else if ((user.equals("rock") && computer.equals("scissors")) ||
                (user.equals("paper") && computer.equals("rock")) ||
                (user.equals("scissors") && computer.equals("paper"))) {

            System.out.println("User Wins");

        } else {

            System.out.println("Computer Wins");
        }
    }
}