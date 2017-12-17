import java.util.ArrayList;

public class CartDB {
	private static ArrayList<Product> products = new ArrayList<Product>();

	public void addProduct(Product product) {
		products.add(product);
	}

	public void removeProduct(Product product) {
		products.remove(product);
	}

	public ArrayList<Product> getProducts() {
		return products;
	}
}
