import java.util.ArrayList;
import java.util.List;

public class OwnerDB {

	private List<StoreOwner> owners = new ArrayList<StoreOwner>();
	
    public OwnerDB() {
    }

    public void addOwner(StoreOwner owner) {
        owners.add(owner);
    }

    public void removeOwner(String userName) {
        // TODO implement here
    }

    public void updateOwner(String userName) {
        // TODO implement here
    }

    public StoreOwner getOwner(String userName) {
        for(int i = 0 ; i < owners.size() ; i++){
        	if(owners.get(i).getUserName().equals(userName)){
        		return owners.get(i);
        	}
        }
        return null;
    }

    public List<StoreOwner> getAllOwners() {
    	return owners;
    }

}