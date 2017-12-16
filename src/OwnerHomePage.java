
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OwnerHomePage {

    private List<Store> stores = new ArrayList<Store>();
    private StoreOwner storeOwner;
    private StoreControl SC; 
    private ProductControl PC;


	public void displayPage(){
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		
		while(true){
			System.out.println(storeOwner.getFirstName() + "'s Home Page");
			System.out.println("..........................");
			System.out.println("My Stores:");
			
			for(int i = 0 ; i < stores.size() ; i++){
				System.out.println("- " + stores.get(i).getName());
			}
			System.out.println("..........................");
			
			if(storeOwner.getType().equals("PO")){
				getMostViewedProduct();
			}
			
			System.out.println("1. Add online store");
			System.out.println("2. Add onsite store");
			System.out.println("3. Add product to store");
			System.out.println("4. Suggest product");
			System.out.println("5. Explore products in store");
			System.out.println("6. Exit System");
			
			
			input = Integer.parseInt(scanner.nextLine());
			switch (input) {
			case 1:
				addOnlineStore();
				break;
			case 2:
				addOnsiteStore();
				break;
			case 3:
				addProduct(); 
				break;
			case 4:
				suggestProduct();
				break;
			case 5:
				viewStore();
				break;
			case 6:
				scanner.close();
				System.exit(0);
				break;
			default:
				System.out.println("invalid input!");
				break;
			}
		}	
	}
	
    public void addOnlineStore() {
        // TODO implement here
    }

    public void addOnsiteStore() {
        // TODO implement here
    }

    public void addProduct() {
        // TODO implement here
    }
    
    public void suggestProduct() {
       	Scanner scanner= new Scanner(System.in);
    	String input1; int input2 = 0;
    	
       	CategoryDB DB1 = new CategoryDB();
    	BrandDB DB2 = new BrandDB();
    	
    	Product suggestedProduct = new Product();
    	
    	
        System.out.print("product name: ");
        input1 = scanner.nextLine();
        suggestedProduct.setName(input1);
        
        //Determine suggested product's category
        
        System.out.println("choose category: ");
        for(int i = 0 ; i < DB1.getAllCategories().size() ; i++){
        	System.out.println((i+1) + "- " + DB1.getAllCategories().get(i).getName());
        }
        System.out.println((DB1.getAllCategories().size()+1) + "- Other");
        System.out.print("category number: "); 
        input2 = Integer.parseInt(scanner.nextLine());
        
        if(input2 == (DB1.getAllCategories().size()+1)){
        	Category suggestedCategory = new Category();
        	
        	System.out.print("new category's name: ");
        	input1 = scanner.nextLine();
        	suggestedCategory.setName(input1);
        	suggestedProduct.setCategory(suggestedCategory);
        }
        else if(input2 > 0 && input2 <= DB1.getAllCategories().size()){
        	suggestedProduct.setCategory(DB1.getAllCategories().get(input2));
        }
        else{
        	System.out.println("invalid input!");
        }
        
        // Determine suggested product's Brand
        
        System.out.println("choose brand: ");
        for(int i = 0 ; i < DB2.getAllBrands().size() ; i++){
        	System.out.println((i+1) + "- " + DB2.getAllBrands().get(i).getName());
        }
        System.out.println((DB2.getAllBrands().size()+1) + "- Other");
        System.out.print("Brand number: "); 
        input2 = Integer.parseInt(scanner.nextLine());
        
        if(input2 == (DB2.getAllBrands().size()+1)){
        	Brand suggestedBrand = new Brand();
        	
        	System.out.print("new Brand's name: ");
        	input1 = scanner.nextLine();
        	suggestedBrand.setName(input1);
        	suggestedProduct.setBrand(suggestedBrand);
        }
        else if(input2 > 0 && input2 <= DB2.getAllBrands().size()){
        	suggestedProduct.setBrand(DB2.getAllBrands().get(input2));
        }
        else{
        	System.out.println("invalid input!");
        }
    	
        PC.suggestProduct(suggestedProduct);
        scanner.close();
    }
    
    public void viewStore(){
    	Scanner scanner = new Scanner(System.in);
    	int input = 0;
    	
    	List<Product> storeProducts = new ArrayList<Product>();
    	while(true){
    		for(int i = 0 ; i < stores.size() ; i++){
    			System.out.println((i+1) + "- " + stores.get(i).getName());
    		}
    		System.out.print("select a store to view: ");
    		
    		input = Integer.parseInt(scanner.nextLine());
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
    	
        if(storeOwner.getType().equals("PO")){
        	PC.exploreProductNumOfViews(product);
        }
        
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

	public void setStoreOwner(StoreOwner storeOwner) { // use it when the user log in as a store owner, to send the store owner to the owner home page.
		this.storeOwner = storeOwner;
		this.stores = storeOwner.getStores();
	}
	
	public void getMostViewedProduct(){
		
	}
   
	public List<Store> getStores() {
		return stores;
	}

	public StoreOwner getStoreOwner() {
		return storeOwner;
	}

    public void removeProduct() {
        // TODO implement here
    }

    public void marketProduct() {
        // TODO implement here
    }



    public Store selectStore() {
        // TODO implement here
        return null;
    }

    public void displayMessage(String message) {
        // TODO implement here
    }
}