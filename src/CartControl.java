import java.util.ArrayList;

public class CartControl {

	public CartControl() {
	}

	public static void buyProducts(Cart cart) {
	}

	public static boolean buyProducts(Cart cart, Buyer buyer) {
		float totalPrice = 0;
		for (int i = 0; i < cart.getProducts().size(); i++) {
			totalPrice += cart.getProducts().get(i).getPrice();
		}
		double voucherValue = buyer.getVoucherCard().getValue();
		double rest = 0;
		if (totalPrice <= voucherValue) {
			rest = voucherValue - totalPrice;
			buyer.getVoucherCard().setValue(rest);
			return true;
		} else {
			return false;
		}
	}

	public static void viewCart(Buyer buyer) {
		ArrayList<Product> products = buyer.getc.getProducts();
		ArrayList<Product> ret = new ArrayList<>();
		for(int i = 0;i < products.size();i++) {
			if(products.get(i).getStoreOwner())
		}
	}
}