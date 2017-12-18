public class LoginAsStandardOwnerControl extends LoginControl {
	public HomePage login(String Identifier, String password) {
		StoreOwner owner = OwnerDB.getOwner(Identifier);
		if (owner == null || !owner.getPassword().equals(password)) {
			message();
			return null;
		}
		LoginControl.Identifier = Identifier;
		LoginControl.password = password;
		OwnerHomePage ret = new OwnerHomePage();
		ret.setStoreOwner((StoreOwner) returnUser(OwnerDB.convertOwnersToUsers()));
		return ret;
	}
}
