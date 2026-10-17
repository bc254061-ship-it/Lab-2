
import java.util.Scanner;

public class Q1AveragaOfThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter First Number: "); // Display the string
        double num1 = input.nextDouble();

        System.out.println("Enter Second Number: "); // Display the string
        double num2 = input.nextDouble();

        System.out.println("Enter Third Number: "); // Display the string
        double num3 = input.nextDouble();

        float avg = (float)(num1 + num2 + num3) / 3;
        System.out.println("Average: " + avg); // Display the average

        input.close();
    }
}