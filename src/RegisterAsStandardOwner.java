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
			userName = Input.takeStrInput();
			check = isItAUniqueUserName(OwnerDB.convertOwnersToUsers());
		}
		System.out.println("First Name : ");
		firstName = Input.takeStrInput();
		System.out.println("last Name");
		lastName = Input.takeStrInput();
		check = true;
		while (check == true) {
			System.out.print("Email: ");
			email = Input.takeStrInput();
			check = isItAUniqueEmail(OwnerDB.convertOwnersToUsers());
		}
		System.out.println("password");
		password = Input.takeStrInput();
		System.out.println("Phone Number : ");
		phoneNum = Input.takeStrInput();
		return new User(userName, firstName, lastName, email, password, phoneNum);
	}

	public void RegisterForm() {
		StoreOwner owner = (StoreOwner) register();
		boolean check = true;
		while (check == true) {
			System.out.print("Commercial Email: ");
			CommercialEmail = Input.takeStrInput();
			check = isItAUniqueCommercialEmail(OwnerDB.getAllOwners());
		}
		owner.setCommercialEmail(CommercialEmail);
		OwnerDB.addOwner(owner);
	}
}
