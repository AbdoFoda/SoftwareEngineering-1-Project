import java.util.ArrayList;
import java.util.HashMap;

public class CartDB {
	static HashMap<Cart, ArrayList<Product>> products;

	public static void addProduct(Product product, Cart cart) {
		products.get(cart).add(product);
	}

	public static void removeProducts(Cart cart) {
		products.get(cart).clear();
	}

	public static void removeProduct(Product product, Cart cart) {
		products.get(cart).remove(product);
	}

	public static ArrayList<Product> getProducts(Cart cart) {
		return products.get(cart);
	}
}
