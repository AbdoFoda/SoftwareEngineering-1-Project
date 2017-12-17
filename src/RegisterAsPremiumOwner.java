public class RegisterAsPremiumOwner extends Register {
	private static String userName;
	private static String firstName;
	private static String lastName;
	private static String email;
	private static String password;
	private static String phoneNum;

	public static User register() {
		boolean check = true;
		while (check == true) {
			System.out.print("Username: ");
			userName = takeStrInput();
			check = isItAUniqueUserName(PremiumOwnerDB.convertPremOwnersToUsers());
		}
		System.out.println("First Name : ");
		firstName = takeStrInput();
		System.out.println("last Name");
		lastName = takeStrInput();
		check = true;
		while (check == true) {
			System.out.print("Email: ");
			email = takeStrInput();
			check = isItAUniqueEmail(PremiumOwnerDB.convertPremOwnersToUsers());
		}
		System.out.println("password");
		password = takeStrInput();
		System.out.println("Phone Number : ");
		phoneNum = takeStrInput();
		return new User(userName, firstName, lastName, email, password, phoneNum);
	}

	public void RegisterForm() {
		PremiumOwner owner = (PremiumOwner) register();
		owner.setCreditCard(setCreditCard());
		PremiumOwnerDB.addOwner(owner);
	}
}
