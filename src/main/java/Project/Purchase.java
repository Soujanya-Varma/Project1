package Project;

import java.util.Scanner;

public class Purchase {
	Scanner sc = new Scanner(System.in);
	void confirm() {
		System.out.println("Enter yes to confirm your purchase :");
		String buy = sc.next();
		if (buy.equals("yes")) {
			System.out.println("Your purchase is successful");
			System.out.println("\nIf you want to go to menu then enter Main or If you want bill then enter bill");
			System.out.println();
		} else {
			System.out.println("Your purchase is unsuccessful \nTry again");
			System.out.println("If you want to exit then enter 0");
			if(buy.equals("0")) {
				System.out.println("Exiting....");
				System.out.println("Exit");
				System.out.println("Thank you for choosing Digit");
				System.out.println("Happy Shopping!");
				System.out.println("Goodbye and come back soon!");
				System.exit(0);
			}
			confirm();
		}

	}
}
