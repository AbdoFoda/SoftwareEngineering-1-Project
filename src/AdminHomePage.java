import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdminHomePage {

	private User user;
	private List<Store> stores = new ArrayList<Store>();
	private StoreControl SC;
	private ProductControl PC;

    public AdminHomePage() {
    	StoreDB DB1 = new StoreDB();
		stores = DB1.getAllStores();
    }
    
    public void displayPage(){
		Scanner scanner= new Scanner(System.in);
		int input = 0;
		while(true){
			System.out.println(user.getFirstName() + "'s Home Page");
			System.out.println("..........................");
			
			System.out.println("stores in the system: ");
			for(int i = 0 ; i < stores.size() ; i++){
				System.out.println("- " + stores.get(i).getName());
			}
			System.out.println("..........................");
			
			System.out.println("1. Add product to the system");
			System.out.println("2. Add brand to the system");
			System.out.println("3. Provide voucher card");
			System.out.println("4. Explore products in store");
			System.out.println("5. Exit System");
			
			input = Integer.parseInt(scanner.nextLine());
			switch (input) {
			case 1:
				addProduct();
				break;
			case 2:
				addBrand();
				break;
			case 3:
				provideVoucherCard(); 
				break;
			case 4:
				viewStore();
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
    }

    public void openRequestsPage() {
        // TODO implement here
    }

    public void addProduct() {
        // TODO implement here
    }

    public void removeProduct() {
        // TODO implement here
    }

    public void addCategory() {
        // TODO implement here
    }

    public void removeCategory() {
        // TODO implement here
    }

    public void addBrand() {
        // TODO implement here
    }

    public void removeBrand() {
        // TODO implement here
    }

    public void selectBuyer() {
        // TODO implement here
    }

    public void provideVoucherCard() {
        // TODO implement here
    }
    
    public void viewStore() {
    	Scanner scanner = new Scanner(System.in);
    	int input = 0;
    	List<Product> storeProducts = new ArrayList<Product>();
    	
    	while(true){
    		for(int i = 0 ; i < stores.size() ; i++){
    			System.out.println((i+1) + "- " + stores.get(i).getName());
    		}
    		System.out.print("select a store: ");
    		
    		input  = Integer.parseInt(scanner.nextLine());
    		storeProducts = SC.viewStore(stores.get(input-1)); // all products in store are printed

    		input = Integer.parseInt(scanner.nextLine());
    		if(input > storeProducts.size()+1 || input < 0){
    			System.out.println("invalid input");
    		}
    		else if(input == storeProducts.size()+1){
    			break;
    		}
    		else{
    			viewProduct(storeProducts.get(input-1));
    		}
    	}
    	scanner.close();
    }
    
    public void viewProduct(Product product){
       	Scanner scanner = new Scanner(System.in);
    	int input = 0;
    	
    	PC.viewProduct(product); // product details printed
        
        System.out.println("1. go back to store");

        input = Integer.parseInt(scanner.nextLine());
        switch (input) {
		case 1:
			break;
		default:
			System.out.println("invalid input!");
			break;
		}
        scanner.close();
    }

}