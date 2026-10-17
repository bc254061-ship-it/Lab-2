package Exercise;

import java.util.Scanner;

public class Exercise2_6 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number between 0 and 1000");
		int number = input.nextInt();
		
		int firstDigit = number % 10;
		int remainingNumber = number / 10;
		
		int secondDigit = remainingNumber % 10;
		remainingNumber = remainingNumber / 10;
		
		int thirdDigit = remainingNumber % 10;
		
		int multiplication = firstDigit * secondDigit * thirdDigit;
		
		System.out.println("The multiplication of all digits in" + number + "is" + multiplication);
		
		input.close();
	
	}

}
