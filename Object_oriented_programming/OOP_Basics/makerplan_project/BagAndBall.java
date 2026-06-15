class Ball {

    private String color;

    Ball(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

class Bag {

    private Ball ball;

    Bag(Ball ball) {
        this.ball = ball;
    }

    void showBall() {
        System.out.println("Bag contains a "
                + ball.getColor() + " ball.");
    }
}

public class BagAndBall {

    public static void main(String[] args) {

        Ball redBall = new Ball("Red");

        Bag bag = new Bag(redBall);

        bag.showBall();
    }
}