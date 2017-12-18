
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
		if (onlineStoreExistInThesystem(store.getName()) == false) {
			StoreDB.addStore(store);
		}
	}

	public static void addOnsiteStore(OnsiteStore store) {
		if (onsiteStoreExistInThesystem(store.getName()) == false) {
			OnsiteStoreDB.addStore(store);
		}
	}

	public static boolean onsiteStoreExistInThesystem(String requiredToAdd) {
		boolean check = false;
		ArrayList<Store> stores = StoreDB.getAllStores();
		for (int i = 0; i < stores.size(); i++) {
			if (stores.get(i).getName().equals(requiredToAdd))
				check = true;
		}
		return check;
	}

	public static boolean onlineStoreExistInThesystem(String requiredToAdd) {
		boolean check = false;
		ArrayList<OnsiteStore> stores = OnsiteStoreDB.getAllStores();
		for (int i = 0; i < stores.size(); i++) {
			if (stores.get(i).getName().equals(requiredToAdd))
				check = true;
		}
		return check;
	}
}