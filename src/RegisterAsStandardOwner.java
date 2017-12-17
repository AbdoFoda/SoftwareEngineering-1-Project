import java.util.ArrayList;

public class RegisterAsStandardOwner extends Register {
	private static String CommercialEmail;

	private static boolean isItAUniqueCommercialEmail(ArrayList<StoreOwner> owners) {
		boolean exist = false;
		for (int i = 0; i < owners.size(); i++) {
			if (owners.get(i).getCommercialEmail().equals(email)) {
				exist = true;
			}
		}
		if (exist == true)
			message("email");
		return exist;
	}

	public static User register() {
		boolean check = true;
		while (check == true) {
			System.out.print("Username: ");
			userName = takeStrInput();
			check = isItAUniqueUserName(OwnerDB.convertOwnersToUsers());
		}
		System.out.println("First Name : ");
		firstName = takeStrInput();
		System.out.println("last Name");
		lastName = takeStrInput();
		check = true;
		while (check == true) {
			System.out.print("Email: ");
			email = takeStrInput();
			check = isItAUniqueEmail(OwnerDB.convertOwnersToUsers());
		}
		System.out.println("password");
		password = takeStrInput();
		System.out.println("Phone Number : ");
		phoneNum = takeStrInput();
		return new User(userName, firstName, lastName, email, password, phoneNum);
	}

	public void RegisterForm() {
		StoreOwner owner = (StoreOwner) register();
		boolean check = true;
		while (check == true) {
			System.out.print("Commercial Email: ");
			CommercialEmail = takeStrInput();
			check = isItAUniqueCommercialEmail(OwnerDB.getAllOwners());
		}
		owner.setCommercialEmail(CommercialEmail);
		OwnerDB.addOwner(owner);
	}
}
