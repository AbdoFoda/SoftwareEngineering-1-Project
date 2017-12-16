import java.util.ArrayList;
import java.util.List;

public class StoreOwner extends User {

    protected String commercialEmail;
    protected List<Store> stores = new ArrayList<Store>();
   
    public StoreOwner() {
    }

    public void setCommercialEmail(String email) {
        this.commercialEmail = email;
    }

    public String getCommercialEmail() {
        return commercialEmail;
    }

    public List<Store> getStores() {
        return stores;
    }

    public void addStore(Store store) {
        stores.add(store);
    }

}