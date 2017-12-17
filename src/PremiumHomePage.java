import java.util.ArrayList;

public class PremiumHomePage extends OwnerHomePage {

	public PremiumHomePage() {
	}

	public void payByCreditCard() {
		// TODO implement here
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
}