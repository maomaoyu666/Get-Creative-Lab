import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class ArraysLab {

	public static void main(String[] args) {
		// Initialize the menu and orders
		String[] menu = {
				"1. Appetizer: Spring Rolls - $5", "2. Appetizer: Garlic Bread - $3",
				"3. Appetizer: Salad - $7", "4. Appetizer: Chicken Wings - $9", "5. Appetizer: Soup - $4",
				"6. Entree: Steak - $20", "7. Entree: Spaghetti - $12", "8. Entree: Burger - $10",
				"9. Entree: Pizza - $14", "10. Entree: Chicken Rice - $13",
				"11. Dessert: Ice Cream - $6", "12. Dessert: Cake - $7", "13. Dessert: Pie - $5",
				"14. Dessert: Pudding - $6", "15. Dessert: Cookies - $3"
		};
		int[] prices = { 5, 3, 7, 9, 4, 20, 12, 10, 14, 13, 6, 7, 5, 6, 3 };
		int[] orders = new int[15];
		int totalMoney = 0;

		Scanner scanner = new Scanner(System.in);

		// Start taking orders
		for (int i = 0; i < 20; i++) {
			// Display the menu
			System.out.println("Welcome to our restaurant! Here's our menu:");
			for (String item : menu) {
				System.out.println(item);
			}
			System.out.println("Please enter the number of the item you want to order:");

			int order = scanner.nextInt();
			if (order < 1 || order > 15) {
				System.out.println("Invalid item number. Please enter a number between 1 and 15.");
				i--; // re-do the current iteration
				continue;
			}
			orders[order - 1]++; // Update the order count for the selected item
			totalMoney += prices[order - 1]; // Update the total money earned
		}
		scanner.close();

		// Display the summary
		System.out.println("Order Summary:");
		System.out.println("Total money made: $" + totalMoney);
		int totalOrders = 0;
		for (int order : orders) {
			totalOrders += order;
		}
		for (int i = 0; i < 15; i++) {
			double percentage = (orders[i] * 100.0) / totalOrders;
			System.out.println(
					"Item " + (i + 1) + " - " + menu[i] + ": " + orders[i] + " orders, " + percentage + "% of sales");
		}
	}
}
