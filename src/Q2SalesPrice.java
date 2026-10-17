
import java.util.Scanner;

public class Q2SalesPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter original price: RM");
        double originalPrice = input.nextDouble();

        System.out.print("Enter discount percentage: ");
        double discount = input.nextDouble();

        double discountedPrice = originalPrice - (originalPrice * discount / 100);

        System.out.printf("Original price: RM%.2f%n", originalPrice);
        System.out.printf("Discounted price: RM%.2f%n", discountedPrice);

        input.close();
    }
}