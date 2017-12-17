import java.util.ArrayList;
import java.util.List;

public class StoreDB {

	private static ArrayList<Store> onlineStores = new ArrayList<Store>();

	public StoreDB() {
	}

	public static void addStore(Store store) {
		onlineStores.add(store);
	}

	public void removeStore(String name) {
		// TODO implement here
	}

	public void updateStore(String name) {
		// TODO implement here
	}

	public Store getStore(String name) {
		for (int i = 0; i < onlineStores.size(); i++) {
			if (onlineStores.get(i).getName().equals(name)) {
				return onlineStores.get(i);
			}
		}
		return null;
	}

	public static ArrayList<Store> getAllStores() {
		return onlineStores;
	}

}