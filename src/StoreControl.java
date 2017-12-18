
import java.util.ArrayList;
import java.util.List;

public class StoreControl {

	public StoreControl() {

	}

	public List<Product> viewStore(Store store) {
		for (int i = 0; i < store.getProducts().size(); i++) {
			System.out.println((i + 1) + "- " + store.getProducts().get(i).getName());
		}
		System.out.println("..........................");
		System.out.println(
				"enter number of product to view it or " + (store.getProducts().size() + 1) + " to exit store");

		return store.getProducts();
	}

	public static boolean storeExistInThesystem(String requiredToAdd) {
		return StoreControl.storeExistInThesystem(requiredToAdd);
	}

	public void addOnlineStore(Store store) {
		// TODO implement here
	}

	public void addOnsiteStore(Store store) {
		// TODO implement here
	}

	public static boolean StoreExistInThesystem(String requiredToAdd) {
		boolean check = false;
		ArrayList<Store> stores = StoreDB.getAllStores();
		for (int i = 0; i < stores.size(); i++) {
			if (stores.get(i).getName().equals(requiredToAdd))
				check = true;
		}
		return check;
	}

}