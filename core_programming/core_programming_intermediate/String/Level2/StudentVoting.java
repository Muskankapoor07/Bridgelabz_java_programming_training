package core_programming.core_programming_intermediate.String.Level2;

import java.util.Random;

class StudentVoting {

    public static void main(String[] args) {

        Random r = new Random();

        int[] ages = new int[10];

        for (int i = 0; i < ages.length; i++) {

            ages[i] = r.nextInt(25);

            if (ages[i] >= 18) {

                System.out.println(ages[i] + " -> Can Vote");

            } else {

                System.out.println(ages[i] + " -> Cannot Vote");
            }
        }
    }
}
