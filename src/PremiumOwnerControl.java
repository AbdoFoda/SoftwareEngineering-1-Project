import java.util.ArrayList;

public class PremiumOwnerControl extends OwnerControl {

	public PremiumOwnerControl() {
	}

	public void viewStatistics() {
		// TODO implement here
	}

	public static long exploreProductNumOfViews(String id) {
		long numberOfViews = ProductControl.exploreProductNumOfViews(id);
		return numberOfViews;
	}

	public static ArrayList<String> getMostViewedProductInfo() {
		Product mostViewedProduct = ProductControl.getMostViewedProduct();
		return ProductControl.productInfo(mostViewedProduct);
	}
}