public class LoginAsStandardOwnerControl extends LoginControl {
	public HomePage login(String Identifier, String password) {
		User user = UserDB.getUser(Identifier);
		if (user == null || password != user.getPassword() || !(user instanceof StoreOwner))
			return null;
		LoginControl.Identifier = Identifier;
		LoginControl.password = password;
		OwnerHomePage ret = new OwnerHomePage();
		ret.setStoreOwner((StoreOwner) returnUser(OwnerDB.convertOwnersToUsers()));
		return ret;
	}
}
