package Project;

import java.util.Scanner;

public class Shop {
	
	String product = "";
	String price = "";
	void shopping() {
		Scanner sc = new Scanner(System.in);
		System.out.println("select one of the options from the following : ");
		Description d = new Description();
		Purchase pur = new Purchase();
		d.category();
		System.out.println("Select category : 1 / 2 / 3 / 4 / 5");
		int cat = sc.nextInt();
		while (cat < 1 || cat > 5) {
			System.out.println("Please select options from 1 to 5 only. If you want to exit then enter 0");
			cat = sc.nextInt();
			if (cat == 0) {
				System.out.println("Exiting....");
				System.out.println("Exit");
				System.out.println("Thank you for choosing Digit");
				System.out.println("Happy Shopping!");
				System.out.println("Goodbye and come back soon!");
				System.exit(0);
			}
		}
		for (int j = 1; j <= 4; j++) {
			System.out.println(j + ". " + d.subcat[cat - 1][j - 1]);
		}
		System.out.println("Select category : 1 / 2 / 3 / 4");
		int subcat = sc.nextInt();
		while (subcat < 1 || subcat > 4) {
			System.out.println("Please select options from 1 to 5 only. If you want to exit then enter 0");
			subcat = sc.nextInt();
			if (subcat == 0) {
				System.out.println("Exiting....");
				System.out.println("Exit");
				System.out.println("Thank you for choosing Digit");
				System.out.println("Happy Shopping!");
				System.out.println("Goodbye and come back soon!");
				System.exit(0);
			}
		}
		for (int j = 1; j <= 5; j++) {
			System.out.println(j + ". " + d.Prod[4 * (cat - 1) + (subcat - 1)][j - 1]);
		}
		System.out.println("Select Product : 1 / 2 / 3 / 4 / 5");
		int pro = sc.nextInt();
		while (pro < 1 || pro > 5) {
			System.out.println("Please select options from 1 to 5 only. If you want to exit then enter 0");
			pro = sc.nextInt();
			if (pro == 0) {
				System.out.println("Exiting....");
				System.out.println("Exit");
				System.out.println("Thank you for choosing Digit");
				System.out.println("Happy Shopping!");
				System.out.println("Goodbye and come back soon!");
				System.exit(0);
			}
		}
		System.out.println("Description : ");
		System.out.println(d.desc[4 * (cat - 1) + (subcat - 1)][pro - 1]);
		
		String desc = d.desc[4 * (cat - 1) + (subcat - 1)][pro - 1];
		String p = d.Prod[4 * (cat - 1) + (subcat - 1)][pro - 1];
		String sp[] = desc.split(" ");
		price = sp[sp.length-1];
		product = p + "   " + price;
		pur.confirm();
	}
}
