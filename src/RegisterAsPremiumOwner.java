public class RegisterAsPremiumOwner extends Register {
	private static String userName;
	private static String firstName;
	private static String lastName;
	private static String email;
	private static String password;
	private static String phoneNum;

	public static User register() {
		do {
			System.out.print("Username: ");
			userName = Input.takeStrInput();
		} while (!isItAUniqueUserName(PremiumOwnerDB.convertPremOwnersToUsers()));

		System.out.println("First Name : ");
		firstName = Input.takeStrInput();

		System.out.println("last Name");
		lastName = Input.takeStrInput();

		do {
			System.out.print("Email: ");
			email = Input.takeStrInput();
		} while (!isItAUniqueEmail(PremiumOwnerDB.convertPremOwnersToUsers()));

		System.out.println("password");
		password = Input.takeStrInput();

		System.out.println("Phone Number : ");
		phoneNum = Input.takeStrInput();

		return new User(userName, firstName, lastName, email, password, phoneNum);
	}

	public void RegisterForm() {
		PremiumOwner owner = new PremiumOwner(register());
		owner.setCreditCard(setCreditCard());
		PremiumOwnerDB.addOwner(owner);
		done();
	}
}
