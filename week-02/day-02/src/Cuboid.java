// Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
//
// Surface Area: 600
// Volume: 1000

public class Cuboid {
    public static void main(String[] args) {

        double cuboidSideA = 50.;
        double cuboidSideB = 100.;
        double cuboidSideC = 200.;

        double cuboidSurface = (2 * cuboidSideA * cuboidSideB) + (2 * cuboidSideB * cuboidSideC) + (2 * cuboidSideC * cuboidSideA);
        double cuboidVolume = cuboidSideA * cuboidSideB * cuboidSideC;

        System.out.println("Surface Are: " + cuboidSurface);
        System.out.println("Volume: " + cuboidVolume);

    }
}
