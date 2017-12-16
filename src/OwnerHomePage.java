
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OwnerHomePage {

    private List<Store> stores = new ArrayList<Store>();
    private StoreOwner storeOwner;
    private StoreControl SC; 
    private ProductControl PC;


	public void displayPage(){

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
			
			
			switch (takeIntInput()) {
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
				System.exit(0);
				break;
			default:
				System.out.println("invalid input!");
				break;
			}
		}	
	}
	
    public int takeIntInput() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.close();
        return input;
    }
    
    public String takeStrInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        return input;
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
       	CategoryDB DB1 = new CategoryDB();
    	BrandDB DB2 = new BrandDB();
    	
    	Product suggestedProduct = new Product();
    	
    	
        System.out.print("product name: ");
        suggestedProduct.setName(takeStrInput());
        
        //Determine suggested product's category
        
        System.out.println("choose category: ");
        for(int i = 0 ; i < DB1.getAllCategories().size() ; i++){
        	System.out.println((i+1) + "- " + DB1.getAllCategories().get(i).getName());
        }
        System.out.println((DB1.getAllCategories().size()+1) + "- Other");
        System.out.print("category number: "); 
        int input = takeIntInput();
        
        if(input == (DB1.getAllCategories().size()+1)){
        	Category suggestedCategory = new Category();
        	
        	System.out.print("new category's name: ");
        	suggestedCategory.setName(takeStrInput());
        	suggestedProduct.setCategory(suggestedCategory);
        }
        else if(input > 0 && input <= DB1.getAllCategories().size()){
        	suggestedProduct.setCategory(DB1.getAllCategories().get(input));
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
        input = takeIntInput();
        
        if(input == (DB2.getAllBrands().size()+1)){
        	Brand suggestedBrand = new Brand();
        	
        	System.out.print("new Brand's name: ");
        	suggestedBrand.setName(takeStrInput());
        	suggestedProduct.setBrand(suggestedBrand);
        }
        else if(input > 0 && input <= DB2.getAllBrands().size()){
        	suggestedProduct.setBrand(DB2.getAllBrands().get(input));
        }
        else{
        	System.out.println("invalid input!");
        }
    	
        PC.suggestProduct(suggestedProduct);
    }
    
    public void viewStore(){
    	List<Product> storeProducts = new ArrayList<Product>();
    	while(true){
    		for(int i = 0 ; i < stores.size() ; i++){
    			System.out.println((i+1) + "- " + stores.get(i).getName());
    		}
    		System.out.print("select a store to view: ");
    		
    		storeProducts = SC.viewStore(stores.get(takeIntInput()-1)); // all products in store are printed

    		int input = takeIntInput();
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
    }
    
    public void viewProduct(Product product){
    	PC.viewProduct(product); // product details printed
    	
        if(storeOwner.getType().equals("PO")){
        	PC.exploreProductNumOfViews(product);
        }
        
        System.out.println("1. go back to store");

        switch (takeIntInput()) {
		case 1:
			break;
		default:
			System.out.println("invalid input!");
			break;
		}
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