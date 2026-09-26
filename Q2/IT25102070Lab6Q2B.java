import java.util.Scanner;

public class IT25102070Lab6Q2B {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];
        int i = 0;

        System.out.println("Please enter 10 numbers:");

        while (i < 10) {

            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();

            i++;
        }

        System.out.println();
        System.out.println("The numbers you entered are:");

        i = 0;

        while (i < 10) {
            System.out.print(numbers[i] + " ");
            i++;
        }

        input.close();
    }
}