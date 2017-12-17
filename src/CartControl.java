import java.util.ArrayList;

public class CartControl {

	public CartControl() {
	}

	public static void buyProducts(Cart cart) {
	}

	public static boolean buyProducts(Cart cart, Buyer buyer) {
		float totalPrice = 0;
		ArrayList<Product> products = CartDB.getProducts(cart);
		for (int i = 0; i < products.size(); i++) {
			totalPrice += products.get(i).getPrice();
		}
		double voucherValue = buyer.getVoucherCard().getValue();
		double rest = 0;
		if (totalPrice <= voucherValue) {
			rest = voucherValue - totalPrice;
			buyer.getVoucherCard().setValue(rest);
			CartDB.removeProducts(cart);
			return true;
		} else {
			CartDB.removeProducts(cart);
			return false;
		}
	}

	public static ArrayList<Product> viewCart(Cart cart) {
		return CartDB.getProducts(cart);
	}
}