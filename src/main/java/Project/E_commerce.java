package Project;

import java.util.Scanner;

public class E_commerce {
	public static void main(String[] args) {
		String prod = "";
		int price = 0;
		Scanner sc = new Scanner(System.in);
		Shop s = new Shop();
		System.out.println("Welcome to Digit Shopping");
		s.shopping();
		String str = sc.next();
		while (str.equals("Main")) {
			prod = prod + s.product + "\n";
			price = price + Integer.parseInt(s.price);
			System.out.println("\nSelected list : ");
			System.out.println(prod);
			s.shopping();
			str = sc.next();
		}
		if(str.equals("bill")) {
			System.out.println();
			prod = prod + s.product + "\n";
			price = price + Integer.parseInt(s.price);
			System.out.println(prod);
			System.out.println("Total Price : "+price);
			System.out.println();
			System.out.println("Thank you for choosing Digit");
			System.out.println("Happy Shopping!");
			System.out.println("Goodbye and come back soon!");
			System.exit(0);
		}
		else if (str != "Main") {
			System.out.println("Exiting......");
			System.out.println("Exit");
			System.out.println("Thank you for choosing Digit");
			System.out.println("Happy Shopping!");
			System.out.println("Goodbye and come back soon!");
			System.exit(0);
		}
	}
}
