import java.util.Scanner;

public class EntryPage {
	public static void main(String[] args) {
		System.out.println("welcome to Vatrina.");
		System.out.println("..........................");
		System.out.println("1. login as buyer.");
		System.out.println("2. login as standard owner..");
		System.out.println("3. login as Premium owner.");
		System.out.println("4. Register as buyer.");
		System.out.println("5. Register as standard owner.");
		System.out.println("6.  Register as Premium owner.");
		System.out.println("7. Exit System.");
		switch (takeIntInput()) {
		case 1:
			(new LoginHomePage()).login(new LoginAsBuyerControl());
			break;
		case 2:
			new LoginHomePage().login(new LoginAsStandardOwnerControl());
			break;
		case 3:
			new LoginHomePage().login(new LoginAsPremiumOwnerControl());
			break;
		case 4:
			UserControl.registerAsBuyer();
			break;
		case 5:
			UserControl.registerAsOwner();
			break;
		case 6:
			UserControl.registerAsPremOwner();
			break;
		case 7:
			System.exit(0);
			break;
		default:
			System.out.println("invalid input!");
			main(args);
			break;
		}

	}

	public static int takeIntInput() {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		scanner.close();
		return input;
	}
}