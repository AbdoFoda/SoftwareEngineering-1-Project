import java.util.ArrayList;

public class ProductDB {

	private static ArrayList<Product> products = new ArrayList<Product>();

	public ProductDB() {
	}

	public static void addProduct(Product product) {
		products.add(product);
	}

	public static void removeProduct(String ID) {

	}

	public static void updateProduct(String ID, Product updatedProduct) {
		// TODO implement here
	}

	public static Product getProduct(String ID) {
		for (int i = 0; i < products.size(); i++) {
			if (products.get(i).getID().equals(ID)) {
				return products.get(i);
			}
		}
		return null;
	}

	public static ArrayList<Product> getAllProducts() {
		return products;
	}

}