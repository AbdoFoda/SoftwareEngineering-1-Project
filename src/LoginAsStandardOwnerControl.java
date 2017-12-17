public class LoginAsStandardOwnerControl extends LoginControl {
	public void login() {
		System.out.println("Username Or Email: ");
		Identifier = takeStrInput();
		password = takeStrInput();
		while (returnUser(OwnerDB.convertOwnersToUsers()) == null) {
			System.out.println("Username Or Email: ");
			Identifier = takeStrInput();
			password = takeStrInput();
		}
		StoreOwner returnedOwner = (StoreOwner) returnUser(OwnerDB.convertOwnersToUsers());
		OwnerHomePage owner = new OwnerHomePage();
		owner.setStoreOwner(returnedOwner);
	}
}
