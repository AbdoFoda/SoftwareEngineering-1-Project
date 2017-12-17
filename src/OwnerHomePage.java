
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class OwnerHomePage implements HomePage {

	protected List<Store> stores = new ArrayList<Store>();
	protected StoreOwner storeOwner;
	protected StoreControl SC;
	protected ProductControl PC;

	public OwnerHomePage() {
		stores = StoreDB.getAllStores();
		PC = new ProductControl();
		SC = new StoreControl();
	}

	public void displayPage() {

		while (true) {
			System.out.println(storeOwner.getFirstName() + "'s Home Page");
			System.out.println("..........................");
			System.out.println("My Stores:");

			for (int i = 0; i < stores.size(); i++) {
				System.out.println("- " + stores.get(i).getName());
			}
			System.out.println("..........................");
			System.out.println("1. Add online store");
			System.out.println("2. Add onsite store");
			System.out.println("3. Add product to store");
			System.out.println("4. Suggest product");
			System.out.println("5. Explore products in store");
			System.out.println("6. Exit System");
			switch (Input.takeIntInput()) {
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

	public void suggestProduct() {
		CategoryDB DB1 = new CategoryDB();
		BrandDB DB2 = new BrandDB();

		Product suggestedProduct = new Product();

		System.out.print("product name: ");
		suggestedProduct.setName(Input.takeStrInput());

		// Determine suggested product's category

		System.out.println("choose category: ");
		for (int i = 0; i < DB1.getAllCategories().size(); i++) {
			System.out.println((i + 1) + "- " + DB1.getAllCategories().get(i).getName());
		}
		System.out.println((DB1.getAllCategories().size() + 1) + "- Other");
		System.out.print("category number: ");
		int input = Input.takeIntInput();

		if (input == (DB1.getAllCategories().size() + 1)) {
			Category suggestedCategory = new Category();

			System.out.print("new category's name: ");
			suggestedCategory.setName(Input.takeStrInput());
			suggestedProduct.setCategory(suggestedCategory);
		} else if (input > 0 && input <= DB1.getAllCategories().size()) {
			suggestedProduct.setCategory(DB1.getAllCategories().get(input));
		} else {
			System.out.println("invalid input!");
		}

		// Determine suggested product's Brand

		System.out.println("choose brand: ");
		for (int i = 0; i < DB2.getAllBrands().size(); i++) {
			System.out.println((i + 1) + "- " + DB2.getAllBrands().get(i).getName());
		}
		System.out.println((DB2.getAllBrands().size() + 1) + "- Other");
		System.out.print("Brand number: ");
		input = Input.takeIntInput();

		if (input == (DB2.getAllBrands().size() + 1)) {
			Brand suggestedBrand = new Brand();

			System.out.print("new Brand's name: ");
			suggestedBrand.setName(Input.takeStrInput());
			suggestedProduct.setBrand(suggestedBrand);
		} else if (input > 0 && input <= DB2.getAllBrands().size()) {
			suggestedProduct.setBrand(DB2.getAllBrands().get(input));
		} else {
			System.out.println("invalid input!");
		}

		PC.suggestProduct(suggestedProduct);
	}

	public void viewStore() {
		List<Product> storeProducts = new ArrayList<Product>();
		while (true) {
			for (int i = 0; i < stores.size(); i++) {
				System.out.println((i + 1) + "- " + stores.get(i).getName());
			}
			System.out.print("select a store to view: ");

			storeProducts = SC.viewStore(stores.get(Input.takeIntInput() - 1)); // all products in store are printed

			int input = Input.takeIntInput();
			if (input > storeProducts.size() + 1 || input < 0) {
				System.out.println("invalid input");
			} else if (input == storeProducts.size() + 1) {
				break;
			} else {
				viewProduct(storeProducts.get(input - 1));
			}
		}
	}

	public void addOnlineStore() {
		OnsiteStore onlineStore = new OnsiteStore();
		System.out.println("1.Store name: ");
		onlineStore.setName(Input.takeStrInput());
		OwnerControl.addOnlineStore(onlineStore);
	}

	public void addOnsiteStore() {
		OnsiteStore onsiteStore = new OnsiteStore();
		System.out.println("1.Store name: ");
		onsiteStore.setName(Input.takeStrInput());
		OwnerControl.addOnsiteStore(onsiteStore);
	}

	public void addProduct() {
		Product product = new Product();
		System.out.println("..........................");
		System.out.println("1.Product quantity: ");
		product.setQuantity(Input.takeIntInput());
		System.out.println("2.Product price: ");
		product.setPrice(Input.takeDoubleInput());
		boolean check = false;
		while (check == false) {
			check = true;
			System.out.println("3.Product name: ");
			product.setName(Input.takeStrInput());
			System.out.println("4.Product ID: ");
			product.setID(Input.takeStrInput());
			check = OwnerControl.productExistInTheAdminSystem(product.getName(), product.getID());
		}
		check = false;
		while (check == false) {
			check = true;
			System.out.println("5.Product Category Name and ID: ");
			product.setCategory(new Category((Input.takeStrInput()), Input.takeStrInput()));

		}
		check = false;
		while (check == false) {
			System.out.println("6.Product Brand Name and ID: ");
			product.setBrand(new Brand((Input.takeStrInput()), Input.takeStrInput()));
		}
		product.setStoreOwner(storeOwner);
		OwnerControl.addProduct(product);
	}

	public void viewProduct(Product product) {
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		ProductControl.viewProduct(product); // product details printed
		System.out.println("1. go back to store");
		input = Integer.parseInt(scanner.nextLine());
		switch (input) {
		case 1:
			break;
		default:
			System.out.println("invalid input!");
			break;
		}
	}

	public void setStoreOwner(StoreOwner storeOwner) {
		// use it when the user log in as a store owner, to send the
		// store owner to the owner home page.
		this.storeOwner = storeOwner;
		this.stores = storeOwner.getStores();
	}

	public List<Store> getStores() {
		return stores;
	}

	public StoreOwner getStoreOwner() {
		return storeOwner;
	}

	public void removeProduct() {
	}

	public void marketProduct() {
	}

	public Store selectStore() {
		return null;
	}
}