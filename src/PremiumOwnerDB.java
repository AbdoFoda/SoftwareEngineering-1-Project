import java.util.ArrayList;

public class PremiumOwnerDB {

	private static ArrayList<PremiumOwner> owners = new ArrayList<PremiumOwner>();

	public PremiumOwnerDB() {
	}

	public static void addOwner(PremiumOwner owner) {
		owners.add(owner);
	}

	public static void removeOwner(String userName) {
	}

	public static void updateOwner(String userName) {

	}

	public static PremiumOwner getOwner(String ID) {
		for (int i = 0; i < owners.size(); i++) {
			if (owners.get(i).getUserName().equals(ID) || owners.get(i).getEmail().equals(ID)) {
				return owners.get(i);
			}
		}
		return null;
	}

	public static ArrayList<PremiumOwner> getAllOwners() {
		return owners;
	}

	public static ArrayList<User> convertPremOwnersToUsers() {
		ArrayList<User> users = new ArrayList<User>();
		for (int i = 0; i < owners.size(); i++) {
			User user = owners.get(i);
			users.add(user);
		}
		return users;
	}
}