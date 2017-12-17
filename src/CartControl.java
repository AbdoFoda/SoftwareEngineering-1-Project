
public class CartControl {

	public CartControl() {
	}

	public void buyProducts(Cart cart) {
		// TODO implement here
	}

	public boolean buyProducts(Cart cart, Buyer buyer) {
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

	public void viewCart(Cart cart) {
	}

}