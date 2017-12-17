
public class LoginAsPremiumOwnerControl extends LoginControl {
	public void login() {
		System.out.println("Username Or Email: ");
		Identifier = takeStrInput();
		password = takeStrInput();
		while (returnUser(PremiumOwnerDB.convertPremOwnersToUsers()) == null) {
			System.out.println("Username Or Email: ");
			Identifier = takeStrInput();
			password = takeStrInput();
		}
		PremiumOwner returnedOwner = (PremiumOwner) returnUser(PremiumOwnerDB.convertPremOwnersToUsers());
		PremiumHomePage owner = new PremiumHomePage();
		owner.setStoreOwner(returnedOwner);
	}
}
