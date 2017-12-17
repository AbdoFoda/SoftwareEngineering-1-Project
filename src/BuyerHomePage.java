import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BuyerHomePage implements HomePage {

	private static Buyer buyer;
	private static List<Advertisment> advertisments = new ArrayList<Advertisment>();
	private List<Store> stores;
	private StoreControl storeControl;
	private ProductControl productControl;

	public BuyerHomePage() {
		stores = StoreDB.getAllStores();
		/// cart = new Cart();
		productControl = new ProductControl();
		storeControl = new StoreControl();
	}

	public void displayPage() {

		while (true) {
			System.out.println(buyer.getFirstName() + "'s Home Page");
			System.out.println("..........................");
			System.out.println("stores:");
			for (int i = 0; i < stores.size(); i++) {
				System.out.println("- " + stores.get(i).getName());
			}
			System.out.println("..........................");
			System.out.println("1. Suggest product");
			System.out.println("2. Explore products in store");
			System.out.println("3. view cart");
			System.out.println("4. Exit System");

			switch (Input.takeIntInput()) {

			case 1:
				suggestProduct();
				break;
			case 2:
				viewStore();
				break;
			case 3:
				viewCart();
				break;
			case 4:
				System.exit(0);
				break;

			default:
				System.out.println("invalid input!");
				break;
			}
		}
	}

	public void suggestProduct() {
		Scanner scanner = new Scanner(System.in);
		String input1;
		int input2 = 0;

		CategoryDB DB1 = new CategoryDB();
		BrandDB DB2 = new BrandDB();

		Product suggestedProduct = new Product();

		System.out.print("product name: ");
		input1 = scanner.nextLine();
		suggestedProduct.setName(input1);

		// Determine suggested product's category

		System.out.println("choose category: ");
		for (int i = 0; i < DB1.getAllCategories().size(); i++) {
			System.out.println((i + 1) + "- " + DB1.getAllCategories().get(i).getName());
		}
		System.out.println((DB1.getAllCategories().size() + 1) + "- Other");
		System.out.print("category number: ");
		input2 = Integer.parseInt(scanner.nextLine());

		if (input2 == (DB1.getAllCategories().size() + 1)) {
			Category suggestedCategory = new Category();

			System.out.print("new category's name: ");
			input1 = scanner.nextLine();
			suggestedCategory.setName(input1);
			suggestedProduct.setCategory(suggestedCategory);
		} else if (input2 > 0 && input2 <= DB1.getAllCategories().size()) {
			suggestedProduct.setCategory(DB1.getAllCategories().get(input2));
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
		input2 = Integer.parseInt(scanner.nextLine());

		if (input2 == (DB2.getAllBrands().size() + 1)) {
			Brand suggestedBrand = new Brand();

			System.out.print("new Brand's name: ");
			input1 = scanner.nextLine();
			suggestedBrand.setName(input1);
			suggestedProduct.setBrand(suggestedBrand);
		} else if (input2 > 0 && input2 <= DB2.getAllBrands().size()) {
			suggestedProduct.setBrand(DB2.getAllBrands().get(input2));
		} else {
			System.out.println("invalid input!");
		}

		productControl.suggestProduct(suggestedProduct);
		scanner.close();
	}

	public void viewStore() {
		Scanner scanner = new Scanner(System.in);
		int input = 0;

		List<Product> storeProducts = new ArrayList<Product>();

		while (true) {
			for (int i = 0; i < stores.size(); i++) {
				System.out.println((i + 1) + "- " + stores.get(i).getName());
			}
			System.out.print("select a store: ");

			input = Integer.parseInt(scanner.nextLine());
			storeProducts = storeControl.viewStore(stores.get(input - 1)); // all products in store are printed

			input = Integer.parseInt(scanner.nextLine());
			if (input > storeProducts.size() + 1 || input < 0) {
				System.out.println("invalid input");
			} else if (input == storeProducts.size() + 1) {
				break;
			} else {
				viewProduct(storeProducts.get(input - 1));
			}
		}
		scanner.close();
	}

	public void viewProduct(Product product) {
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		productControl.viewProduct(product); // product details printed
		System.out.println("1- add product to cart");
		System.out.println("2- go back to store");

		switch (input) {
		case 1:
			addToCart(product);
			break;
		case 2:
			break;
		default:
			System.out.println("invalid input!");
			break;
		}
	}

	public void addToCart(Product product) {
		BuyerControl.addToCart(product);
	}

	public void setBuyer(Buyer buyer) {
		BuyerHomePage.buyer = buyer;
	}

	public void viewCart() {
		buyer.getCart().viewCart(buyer);
		System.out.println("..........................");
		System.out.println("1. Buy products");
		System.out.println("2. Return to home page");

		switch (Input.takeIntInput()) {
		case 1:
			buyProducts();
			break;
		case 2:
			break;
		default:
			System.out.println("Invalid input!");
			break;
		}
	}

	public void buyProducts() {
		cartControl.buyProducts(buyer.getCart());
	}

	public Buyer getBuyer() {
		return buyer;
	}

	public void removeFromCart() {
		// TODO implement here
	}

	public void searchByCategory() {
		// TODO implement here
	}

	public void searchByBrand() {
		// TODO implement here
	}

	public void searchByName() {
		// TODO implement here
	}
}