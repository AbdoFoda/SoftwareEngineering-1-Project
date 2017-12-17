import java.util.ArrayList;

public class OwnerControl {

	public OwnerControl() {
	}

	public void register(StoreOwner owner) {
		// TODO implement here
	}

	public void acceptOwner(StoreOwner owner) {
		// TODO implement here
	}

	public void rejectOwner(StoreOwner owner) {
		// TODO implement here
	}

	public boolean productExistInThesystem(String requiredToAdd) {
		boolean check = false;
		ArrayList<Product> products = ProductDB.getAllProducts();
		for (int i = 0; i < products.size(); i++) {
			if (products.get(i).getName().equals(requiredToAdd))
				check = true;
		}
		return check;
	}

	public boolean storeExistInThesystem(String requiredToAdd) {
		boolean check = false;
		ArrayList<Store> stores = StoreDB.getAllStores();
		for (int i = 0; i < stores.size(); i++) {
			if (stores.get(i).getName().equals(requiredToAdd))
				check = true;
		}
		return check;
	}

	public void addProduct(Product product) {
		if (productExistInThesystem(product.getName()) == false) {
			ProductDB.addProduct(product);
		}
	}

	public void addStore(Store store) {
		if (storeExistInThesystem(store.getName()) == false) {
			StoreDB.addStore(store);
		}
	}
}