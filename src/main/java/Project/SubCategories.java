package Project;

public class SubCategories extends Categories{
	
	String subcat[][] = {

			// Electronics
			{ "Laptop", "Mobile", "Wearables", "TV" },

			// Fashion
			{ "Men", "Women", "Kids", "Watches" },

			// Groceries
			{ "Snacks", "Household Care", "Skin Care", "Beverages" },

			// Furniture
			{ "Sofa", "Table", "Bed", "Wardrobe" },

			// Books
			{ "Fiction", "Health and Fitness", "Children", "Education" } };

	@Override
	void category() {
		for (int i = 0; i < 5; i++) {
			System.out.println((i + 1) + ". " + cat[i]);
		}
	}
}
