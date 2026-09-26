import java.util.Scanner;

public class IT25102070Lab6Q1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = input.nextDouble();

        double square = number * number;
        double squareRoot = Math.sqrt(number);

        System.out.println();
        System.out.println("The square of " + number + " is : " + square);
        System.out.println("The square root of " + number + " is : " + squareRoot);

        input.close();
    }
}