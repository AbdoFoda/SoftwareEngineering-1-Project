public class EntryPage implements HomePage {

	public static void main(String[] args) {
		EntryPage m = new EntryPage();
		m.displayPage();
	}

	@Override
	public void displayPage() {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("welcome to Vatrina.");
			System.out.println("..........................");
			System.out.println("1. login as Admin.");
			System.out.println("2. login as buyer.");
			System.out.println("3. login as standard owner..");
			System.out.println("4. login as Premium owner.");
			System.out.println("5. Register as buyer.");
			System.out.println("6. Register as standard owner.");
			System.out.println("7. Register as Premium owner.");
			System.out.println("8. Exit System.");
			switch (Input.takeIntInput()) {
			case 1:
				new LoginHomePage().login(new LoginAsAdminControl());
				break;
			case 2:
				new LoginHomePage().login(new LoginAsBuyerControl());
				break;
			case 3:
				new LoginHomePage().login(new LoginAsStandardOwnerControl());
				break;
			case 4:
				new LoginHomePage().login(new LoginAsPremiumOwnerControl());
				break;
			case 5:
				new RegisterAsBuyer().RegisterForm();
				break;
			case 6:
				new RegisterAsStandardOwner().RegisterForm();
				break;
			case 7:
				new RegisterAsPremiumOwner().RegisterForm();
				break;
			case 8:
				System.exit(0);
				break;
			default:
				System.out.println("invalid input!");
				break;
			}
		}

	}
}