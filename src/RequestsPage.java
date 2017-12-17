import java.util.ArrayList;
import java.util.List;

public class RequestsPage {

	private User user;
	private List<StoreOwner> owners = new ArrayList<StoreOwner>();
	private List<Product> suggestedProducts = new ArrayList<Product>();

	public RequestsPage() {
	}

	public void addOwner(StoreOwner owner) {
		owners.add(owner);
	}

	public void addProduct(Product product) {
		suggestedProducts.add(product);
	}

	public void acceptOwner() {
		// TODO implement here
	}

	public void rejectOwner() {
		// TODO implement here
	}

	public void acceptProduct() {
		// TODO implement here
	}

}