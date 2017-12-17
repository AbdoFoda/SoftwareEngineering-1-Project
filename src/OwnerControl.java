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

	public void addStore(String name) {
		if (productExistInThesystem(name) == false) {
			ProductDB.add(product);
		}
	}

	public void addStore(Store store) {
		if (productExistInThesystem(store) == false) {
			ProductDB.add(product);
		}
	}
}