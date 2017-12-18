
import java.util.ArrayList;
import java.util.List;

public class StoreControl {

	public StoreControl() {

	}

	public static List<Product> viewStore(Store store) {
		System.out.println("Products of this store : ");
		for (int i = 0; i < store.getProducts().size(); i++) {
			System.out.println((i + 1) + "- " + store.getProducts().get(i).getName());
		}
		System.out.println("..........................");
		System.out.println("exit store");
		return store.getProducts();
	}

	public static boolean storeExistInThesystem(String requiredToAdd) {
		return StoreControl.storeExistInThesystem(requiredToAdd);
	}

	public static void addOnlineStore(Store store) {
		if (StoreExistInThesystem(store.getName()) == false) {
			StoreDB.addStore(store);
		}
	}

	public static void addOnsiteStore(OnsiteStore store) {
		if (StoreExistInThesystem(store.getName()) == false) {
			OnsiteStoreDB.addStore(store);
		}
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