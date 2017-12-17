public class LoginHomePage implements HomePage {
	String Identifier;
	String password;

	public void login(LoginControl controller) {
		displayPage();
		while (controller.login(Identifier, password) == null) {
			displayPage();
			if (Identifier.equals("back")) {
				EntryPage entry= new EntryPage();
				entry.displayPage();
				break;
			}
		}

		HomePage nextPage = controller.login(Identifier, password);
		nextPage.displayPage();
	}

	public void displayPage() {
		System.out.println("Username Or Email: ");
		Identifier = Input.takeStrInput();
		System.out.println("Password: ");
		password = Input.takeStrInput();
	}
}
