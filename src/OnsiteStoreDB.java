import java.util.ArrayList;

public class OnsiteStoreDB {
	static ArrayList<OnsiteStore> onsiteStores = new ArrayList<OnsiteStore>();

	public static void addOnsiteStore(OnsiteStore store) {
		onsiteStores.add(store);
	}

	public Store getStore(String name) {
		for (int i = 0; i < onsiteStores.size(); i++) {
			if (onsiteStores.get(i).getName().equals(name)) {
				return onsiteStores.get(i);
			}
		}
		return null;
	}

	public static ArrayList<OnsiteStore> getAllStores() {
		return onsiteStores;
	}
}
