import java.util.Scanner;

public class EntryPage {

	private User user;
	
    public EntryPage() {
    }

    public void diplayPage(){
    	Scanner scanner = new Scanner(System.in);
    	int input = 0;
    	
    	System.out.println("welcome to Vatrina");
    	System.out.println("..........................");
    	
		System.out.println("1. login");
		System.out.println("2. Register as standard owner");
		System.out.println("3. Register as premium owner");
		System.out.println("4. Register as buyer");
		System.out.println("5. Exit System");
		
		input = Integer.parseInt(scanner.nextLine());
		switch (input) {
		case 1:
			logIn();
			break;
		case 2:
			registerAsStandardOwner();
			break;
		case 3:
			registerAsPremiumOwner();
			break;
		case 4:
			registerAsBuyer();
			break;
		case 5:
			scanner.close();
			System.exit(0);
			break;
		default:
			System.out.println("invalid input!");
			break;
		}
    	
    }
    
    public void logIn() {
        // TODO implement here
    }

    public void registerAsStandardOwner() {
        // TODO implement here
    }

    public void registerAsPremiumOwner() {
        // TODO implement here
    }

    public void registerAsBuyer() {
        // TODO implement here
    }

    public void viewMessage(String message) {
        // TODO implement here
    }

}