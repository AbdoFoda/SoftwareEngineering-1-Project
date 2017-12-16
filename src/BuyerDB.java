import java.util.ArrayList;
import java.util.List;

public class BuyerDB {

	 private List<Buyer> buyers = new ArrayList<Buyer>();
	
    public BuyerDB() {
    }

    public void addBuyer(Buyer buyer) {
        buyers.add(buyer);
    }

    public void removeBuyer(String userName) {
        // TODO implement here
    }

    public void updateBuyer(String userName) {
        // TODO implement here
    }

    public Buyer getBuyer(String userName) {
        for(int i = 0 ; i < buyers.size() ; i++){
        	if(buyers.get(i).getUserName().equals(userName)){
        		return buyers.get(i);
        	}
        }
        return null;
    }

    public List<Buyer> getAllBuyers() {
        return buyers;
    }

}