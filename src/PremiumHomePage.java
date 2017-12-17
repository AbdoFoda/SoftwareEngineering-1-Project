import java.util.ArrayList;

public class PremiumHomePage extends OwnerHomePage implements HomePage {
	private PremiumOwner premiumOwner;

	public PremiumHomePage() {
	}

	public void payByCreditCard() {
	}

	public void exploreProductNumOfViews() {
		String id = User.takeStrInput();
		System.out.println(PremiumOwnerControl.exploreProductNumOfViews(id));
	}

	public void getMostViewedProduct() {
		ArrayList<String> info = PremiumOwnerControl.getMostViewedProductInfo();
		System.out.println("Name: " + info.get(0));
		System.out.println("ID : " + info.get(1));
		System.out.println("Number Of Views : " + info.get(2));
	}

	public void displayPage() {
		while (true) {
			System.out.println(premiumOwner.getFirstName() + "'s Home Page");
			System.out.println("..........................");
			System.out.println("My Stores:");

			for (int i = 0; i < stores.size(); i++) {
				System.out.println("- " + stores.get(i).getName());
			}
			System.out.println("..........................");
			System.out.println("1. Add online store");
			System.out.println("2. Add onsite store");
			System.out.println("3. Add product to store");
			System.out.println("4. Suggest product");
			System.out.println("5. Explore products in store");
			System.out.println("6. Explore Product Num Of Views");
			System.out.println("7. Get Most Viewed Product");
			System.out.println("8. Exit System");
			switch (Input.takeIntInput()) {
			case 1:
				addOnlineStore();
				break;
			case 2:
				addOnsiteStore();
				break;
			case 3:
				addProduct();
				break;
			case 4:
				suggestProduct();
				break;
			case 5:
				viewStore();
				break;
			case 6:
				exploreProductNumOfViews();
				break;
			case 7:
				getMostViewedProduct();
				break;
			case 8:
				System.exit(0);
				break;
			default:
				System.out.println("invalid input!");
				break;
			}
		}
	}
}