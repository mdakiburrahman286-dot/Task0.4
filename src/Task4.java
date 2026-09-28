import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first side: ");
        double a = input.nextDouble();

        System.out.print("Enter second side: ");
        double b = input.nextDouble();

        System.out.print("Enter third side: ");
        double c = input.nextDouble();

        // Semi-perimeter
        double s = (a + b + c) / 2;

        // Heron's formula
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("Area of the triangle = " + area);
    }
}