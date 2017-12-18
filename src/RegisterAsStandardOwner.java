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
		return !exist;
	}

	public static User register() {
		do {
			System.out.print("Username: ");
			userName = Input.takeStrInput();
		} while (!isItAUniqueUserName(OwnerDB.convertOwnersToUsers()));

		System.out.println("First Name : ");
		firstName = Input.takeStrInput();

		System.out.println("last Name");
		lastName = Input.takeStrInput();

		do {
			System.out.print("Email: ");
			email = Input.takeStrInput();
		} while (!isItAUniqueEmail(OwnerDB.convertOwnersToUsers()));

		System.out.println("password");
		password = Input.takeStrInput();

		System.out.println("Phone Number : ");
		phoneNum = Input.takeStrInput();
		return new User(userName, firstName, lastName, email, password, phoneNum);
	}

	public void RegisterForm() {
		StoreOwner owner = new StoreOwner(register());
		do {
			System.out.print("Commercial Email: ");
			CommercialEmail = Input.takeStrInput();
		} while (!isItAUniqueCommercialEmail(OwnerDB.getAllOwners()));
		owner.setCommercialEmail(CommercialEmail);
		OwnerDB.addOwner(owner);
		done();
	}

}
