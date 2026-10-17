
import java.util.Scanner;

public class Q3WeightOfParcel {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double pound = input.nextDouble();

        double conversionFactor = 0.453592;
        double kg = pound * conversionFactor;

        System.out.printf("Weight in kilograms: %.2f kg%n", kg);

        input.close();
	}

}