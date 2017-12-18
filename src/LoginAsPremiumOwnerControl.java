
public class LoginAsPremiumOwnerControl extends LoginControl {
	public HomePage login(String Identifier, String password) {
		PremiumOwner owner = PremiumOwnerDB.getOwner(Identifier);
		if (owner == null || !owner.getPassword().equals(password)) {
			message();
			return null;
		}
		LoginControl.Identifier = Identifier;
		LoginControl.password = password;
		PremiumHomePage ret = new PremiumHomePage();
		ret.setPremiumOwner((PremiumOwner) returnUser(PremiumOwnerDB.convertPremOwnersToUsers()));
		return ret;
	}
}