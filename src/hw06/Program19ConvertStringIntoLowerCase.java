package hw06;

import java.util.*;
public class Program19ConvertStringIntoLowerCase {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Input a String: ");
        String line = in.nextLine();
        System.out.print("Lower Case line is: ");
        line = line.toLowerCase();
        System.out.println(line);
    }
}