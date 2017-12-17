import java.util.ArrayList;

public class BuyerControl {
	public BuyerControl() {
	}

	public void register(Buyer buyer) {
		// TODO implement here
	}

	public void payOnDelivery(String address) {
		// TODO implement here
	}

	public static void addToCart(Product product, Cart cart) {
		ProductControl.addToCart(product, cart);
	}

	public static void viewCart(Cart cart) {
		ArrayList<Product> products = CartControl.viewCart(cart);
		for (int i = 0; i < products.size(); i++) {
			System.out
					.println("Product Name and price: " + products.get(i).getName() + " " + products.get(i).getPrice());
		}
	}

}