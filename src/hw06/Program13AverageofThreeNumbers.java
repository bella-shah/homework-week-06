package hw06;

import java.util.Scanner;
public class Program13AverageofThreeNumbers {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double x = in.nextDouble();
        System.out.print("Enter the second number: ");
        double y = in.nextDouble();
        System.out.print("Enter the third number: ");
        double z = in.nextDouble();
        System.out.print("The average value is " + average(x, y, z)+"\n" );
    }

    public static double average(double x, double y, double z)
    {
        return (x + y + z) / 3;
    }
}
