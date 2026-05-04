package core_programming.core_programming_basics.programming_element.Level1;

public class EarthVolume {
    public static void main(String[] args) {
        double radius = 6378;
        double volumeKm = (4.0 / 3) * Math.PI * Math.pow(radius, 3);

        double volumeMiles = volumeKm * 0.239913; // approx conversion

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm +
                " and cubic miles is " + volumeMiles);
    }
}