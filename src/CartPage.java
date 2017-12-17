import java.util.ArrayList;
import java.util.Scanner;

public class CartPage {

	private Buyer buyer;
	private BuyerHomePage buyerHomePage;

	public CartPage(Buyer buyer) {
		this.buyer = buyer;
		viewCart();
	}

	public void viewCart() {
		System.out.println("................Cart Page...................");
		ArrayList<Product> products = CartDB.getProducts(buyer.getCart());
		for (int i = 0; i < products.size(); i++) {
			System.out.println((i + 1) + "- " + products.get(i));
		}
		boolean validInput = false;
		Scanner sc = new Scanner(System.in);
		int input;
		while (!validInput) {
			System.out.println("1. Buy Products");
			System.out.println("2. Home Page");
			System.out.println("0. Exit System");
			input = sc.nextInt();
			switch (input) {
			case 1:
				buyProducts(buyer.getCart(), buyer);
				validInput = true;
				break;
			case 2:
				backToBuyerHomePage();
				validInput = true;
				break;
			case 0:
				System.exit(0);
				validInput = true;
				break;
			default:
				System.out.println("Invalid input!");
			}

		}
		while (true) {
			System.out.println("1. Home Page");
			System.out.println("0. Exit System");
			input = sc.nextInt();
			switch (input) {
			case 1:
				backToBuyerHomePage();
				break;
			case 0:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid input!");
			}

		}
	}

	public void backToBuyerHomePage() {
		buyerHomePage.displayPage();
	}

	public static void buyProducts(Cart cart, Buyer buyer) {
		boolean done = CartControl.buyProducts(cart, buyer);
		if (done) {
			System.out.println("you have successfully paid! Now you have $" + buyer.getVoucherCard().getValue());
		} else {
			System.out.println("Sorry! you have only $" + buyer.getVoucherCard().getValue());
		}
	}

}