
public class LoginAsPremiumOwnerControl extends LoginControl {
	public HomePage login(String Identifier, String password) {
		System.out.println("Username Or Email: ");
		LoginControl.Identifier = Identifier;
		LoginControl.password = password;
		PremiumHomePage ret = new PremiumHomePage();
		ret.setStoreOwner((PremiumOwner) returnUser(PremiumOwnerDB.convertPremOwnersToUsers()));
		return ret;
	}
}