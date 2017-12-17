import java.util.ArrayList;
import java.util.List;

public class BuyerDB {

	private static ArrayList<Buyer> buyers = new ArrayList<Buyer>();

	public BuyerDB() {
	}

	public static void addBuyer(Buyer buyer) {
		buyers.add(buyer);
	}

	public static void removeBuyer(String userName) {
	}

	public static void updateBuyer(String userName) {
	}

	public static Buyer getBuyer(String Identifier) {
		for (int i = 0; i < buyers.size(); i++) {
			if (buyers.get(i).getUserName().equals(Identifier) || buyers.get(i).getEmail().equals(Identifier)) {
				return buyers.get(i);
			}
		}
		return null;
	}

	public static ArrayList<Buyer> getAllBuyers() {
		return buyers;
	}

	public static ArrayList<User> convertBuyersToUsers() {
		ArrayList<User> users = new ArrayList<User>();
		for (int i = 0; i < buyers.size(); i++) {
			User user = buyers.get(i);
			users.add(user);
		}
		return users;
	}

}