package hw06;

import java.util.Scanner;
public class Program14AreaandPerimeterofRectangle  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length and the width of a rectangle: ");
        double length = input.nextDouble();
        double width = input.nextDouble();
        double area = (length * width);
        double perimeter = (length * 2 + width * 2);
        System.out.println("The area of the rectangle is " + (int)(area * 100) / 100.0 + ".");
        System.out.println("The perimeter of the rectangle is " + (int)(perimeter * 100) / 100.0 + ".");
    }
}

