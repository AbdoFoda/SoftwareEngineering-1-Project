
public class LoginAsAdminControl extends LoginControl {
	public HomePage login(String Identifier, String password) {
		Admin admin = AdminDB.Virtual_DB.getAdmin(Identifier);
		if (admin == null || !admin.getPassword().equals(password)) {
			message();
			return null;
		}
		LoginControl.Identifier = Identifier;
		LoginControl.password = password;
		AdminHomePage ret = new AdminHomePage();
		ret.setAdmin((Admin) returnUser(AdminDB.Virtual_DB.convertAdminsToUsers()));
		return ret;
	}
}
