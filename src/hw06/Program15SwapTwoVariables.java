package hw06;

 public class Program15SwapTwoVariables {

    public static void main(String[] args) {

        int a, b, temp;
        a = 16;
        b = 28;
        System.out.println("Before swapping : a, b = "+a+", "+ + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping : a, b = "+a+", "+ + b);
    }
}

