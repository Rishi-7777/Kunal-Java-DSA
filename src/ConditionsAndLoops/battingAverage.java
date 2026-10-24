package ConditionsAndLoops;
import java.util.Scanner;
public class battingAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double sum = 0;
        System.out.print("Enter the number of dismiss: ");
        double n = in.nextDouble();

        System.out.print("Enter the batting scores: ");
        for(int i=0;i<n;i++){
            sum+=in.nextDouble();

        }
        double average = sum/n;
        System.out.println(average);
    }
}
