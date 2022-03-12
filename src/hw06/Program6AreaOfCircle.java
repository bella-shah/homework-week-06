package hw06;

import java.util.Scanner;

//formula a=PI*r*r
public class Program6AreaOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the radius: ");

        double radius = scanner.nextDouble();

        System.out.println("Area of the Circle is: "+Math.PI * radius * radius );
    }
}
