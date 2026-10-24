package ConditionsAndLoops;
import java.util.Scanner;
public class volumeofPyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("-----Volume of a pyramid-----");
        System.out.print("Enter the base area of the pyramid: ");
        double baseArea = in.nextDouble();

        System.out.print("Enter the height of the pyramid: ");
        double height= in.nextDouble();
        System.out.print("Enter the length of the pyramid: ");
        double length = in.nextDouble();

        double volume = (baseArea*height*length)/3;

        System.out.printf("The volume of the pyramid is: %.2f",volume);
    }
}
