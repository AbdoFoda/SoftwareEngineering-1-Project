import java.util.ArrayList;
import java.util.List;

public class PremiumHomePage extends OwnerHomePage implements HomePage {
	private PremiumOwner premiumOwner;

	public PremiumHomePage() {
	}

	public void setPremiumOwner(PremiumOwner premiumOwner) {
		this.premiumOwner = premiumOwner;
	}

	public PremiumOwner getPremiumOwner() {
		return premiumOwner;
	}

	public void payByCreditCard() {
	}

	public void exploreProductNumOfViews() {
		String id = Input.takeStrInput();
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
			List<Store> stores = new ArrayList<Store>();
			stores.addAll(StoreDB.getAllStores());
			stores.addAll(OnsiteStoreDB.getAllStores());
			for (int i = 0; i < stores.size(); i++) {
				System.out.println("- " + stores.get(i).getName());
			}
			System.out.println("..........................");
			System.out.println("1. Explore Product Num Of Views");
			System.out.println("2. Get Most Viewed Product");
			System.out.println("3. Exit System");
			System.out.println("4. Back to Home Page");
			System.out.println("5. more options..");
			switch (Input.takeIntInput()) {
			case 1:
				exploreProductNumOfViews();
				break;
			case 2:
				getMostViewedProduct();
				break;
			case 3:
				System.exit(0);
				break;
			case 4:
				EntryPage entry = new EntryPage();
				entry.displayPage();
				break;
			case 5:
				new OwnerHomePage((StoreOwner)premiumOwner).displayPage();
				break;
			default:
				System.out.println("invalid input!");
				break;
			}
		}
	}
}