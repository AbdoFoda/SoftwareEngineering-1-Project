
public class LoginAsPremiumOwnerControl extends LoginControl {
	public HomePage login(String Identifier, String password) {
		User user = UserDB.getUser(Identifier);
		if (user == null || password != user.getPassword() || !(user instanceof PremiumOwner))
			return null;
		LoginControl.Identifier = Identifier;
		LoginControl.password = password;
		PremiumHomePage ret = new PremiumHomePage();
		ret.setStoreOwner((PremiumOwner) returnUser(PremiumOwnerDB.convertPremOwnersToUsers()));
		return ret;
	}
}