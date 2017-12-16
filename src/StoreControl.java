
import java.util.List;

public class StoreControl {
	
    public StoreControl() {
    }

    public List<Product> viewStore(Store store) {
	
    	for(int i = 0 ; i < store.getProducts().size() ; i++){
			System.out.println((i+1)+ "- " + store.getProducts().get(i).getName());
		}
		System.out.println("..........................");
		System.out.println("enter number of product to view it or " + (store.getProducts().size()+1) +" to exit store");
    	
    	return store.getProducts();
    }

    public void addOnlineStore(Store store) {
        // TODO implement here
    }

    public void addOnsiteStore(Store store) {
        // TODO implement here
    }

}