class Line {

    double x1, y1, x2, y2;

    Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    double calculateLength() {
        return Math.sqrt(
                Math.pow(x2 - x1, 2) +
                Math.pow(y2 - y1, 2));
    }
}

public class LineComparison {

    public static void main(String[] args) {

        Line line1 = new Line(1, 2, 4, 6);
        Line line2 = new Line(2, 3, 6, 8);

        double length1 = line1.calculateLength();
        double length2 = line2.calculateLength();

        System.out.println("Line 1 Length: " + length1);
        System.out.println("Line 2 Length: " + length2);

        if (length1 > length2) {
            System.out.println("Line 1 is Longer");
        } else if (length1 < length2) {
            System.out.println("Line 2 is Longer");
        } else {
            System.out.println("Both Lines are Equal");
        }
    }
}