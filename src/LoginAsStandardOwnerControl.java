public class LoginAsStandardOwnerControl extends LoginControl {
	public HomePage login(String Identifier, String password) {
		System.out.println("Username Or Email: ");
		LoginControl.Identifier = Identifier;
		LoginControl.password = password;
		OwnerHomePage ret = new OwnerHomePage();
		ret.setStoreOwner((StoreOwner) returnUser(OwnerDB.convertOwnersToUsers()));
		return ret;
	}
}
