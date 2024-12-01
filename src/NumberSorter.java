import java.util.Scanner;

public class NumberSorter {

    public static void displaySortedNumbers(double num1, double num2, double num3) {
        double temp;

        // Sort the numbers using simple comparisons
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        // Display numbers in sorted order
        System.out.println("Numbers in increasing order: " + num1 + ", " + num2 + ", " + num3);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.println("Enter three numbers:");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        // Call the method to display sorted numbers
        displaySortedNumbers(num1, num2, num3);
    }
}
