import java.util.ArrayList;
import java.util.List;

public class StoreDB {
	
	private List<Store> stores = new ArrayList<Store>();

    public StoreDB() {
    }

    public void addStore(Store store) {
        stores.add(store);
    }

    public void removeStore(String name) {
        // TODO implement here
    }

    public void updateStore(String name) {
        // TODO implement here
    }

    public Store getStore(String name) {
        for(int i = 0 ; i < stores.size() ; i++){
        	if(stores.get(i).getName().equals(name)){
        		return stores.get(i);
        	}
        }
        return null;
    }

    public List<Store> getAllStores() {
        return stores;
    }

}