import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdminHomePage implements HomePage {

	private Admin admin;
	private List<Store> stores = new ArrayList<Store>();

	public AdminHomePage() {
		stores = StoreDB.getAllStores();
	}

	public void displayPage() {
		while (true) {

			System.out.println(admin.getFirstName() + "'s Home Page");
			System.out.println("..........................");

			System.out.println("stores in the system: ");
			for (int i = 0; i < stores.size(); i++) {
				System.out.println("- " + stores.get(i).getName());
			}
			System.out.println("..........................");

			System.out.println("1. Add product to the system");
			System.out.println("2. Add brand to the system");
			System.out.println("3. Provide voucher card");
			System.out.println("4. Explore products in store");
			System.out.println("5. Exit System");
			System.out.println("6. back to home page.");

			switch (Input.takeIntInput()) {
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
				System.exit(0);
				break;
			case 6:
				EntryPage entry = new EntryPage();
				entry.displayPage();
				break;
			default:
				System.out.println("invalid input!");
				break;
			}
		}
	}

	public static void addProduct() {

		System.out.println("please enter product information");
		System.out.println("product name :");

		String name = Input.takeStrInput();
		System.out.println("product ID :");
		String id = Input.takeStrInput();
		System.out.println("category name :");
		String categoryName = Input.takeStrInput();
		System.out.println("category ID :");
		String categoryId = Input.takeStrInput();
		System.out.println("brand name:");
		String brandName = Input.takeStrInput();
		System.out.println("brand ID:");
		String brandId = Input.takeStrInput();
		System.out.println("quantity :");
		int quantity = Input.takeIntInput();
		System.out.println("price :");
		double price = Input.takeDoubleInput();
		Category category = new Category(categoryName, categoryId);
		Brand brand = new Brand(brandName, brandId);
		Product product = new Product(name, id, category, brand, price, quantity);
		boolean check = AdminControl.addProduct(product);
		AdminControl.addBrand(brand);
		AdminControl.addCategory(category);
		if (check)
			System.out.println("the product added successfully to the system");
		else
			System.out.println("the product already exists in the system");

	}

	public static void addBrand() {
		System.out.println("brand name:");
		String brandName = Input.takeStrInput();
		System.out.println("brand ID:");
		String brandId = Input.takeStrInput();
		Brand brand = new Brand(brandName, brandId);
		boolean check = AdminControl.addBrand(brand);
		if (check)
			System.out.println("the brand added successfully to the system ");
		else
			System.out.println("the brand already exists in the system");

	}

	public static void provideVoucherCard() {
		AdminControl.provideVoucherCard();
		System.out.println("VoucherCards generated successfully in the system");

	}

	public void viewStore() {

		List<Product> storeProducts = new ArrayList<Product>();

		while (true) {
			for (int i = 0; i < stores.size(); i++) {
				System.out.println((i + 1) + "- " + stores.get(i).getName());
			}
			System.out.print("select a store: ");
			Integer idx = Input.takeIntInput();
			if (idx > storeProducts.size() + 1 || idx < 0) {
				System.out.println("invalid input");
			} else if (idx == storeProducts.size() + 1) {
				break;
			} else {
				storeProducts = StoreControl.viewStore(stores.get(idx - 1));
				viewProduct(storeProducts.get(idx - 1));
			}
		}
	}

	public void openRequestsPage() {
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

	public void removeBrand() {
		// TODO implement here
	}

	public void selectBuyer() {
		// TODO implement here
	}

	public void viewProduct(Product product) {
		ProductControl.viewProduct(product); // product details printed

		System.out.println("1. go back to store");

		switch (Input.takeIntInput()) {
		case 1:
			EntryPage entry = new EntryPage();
			entry.displayPage();
			break;
		default:
			System.out.println("invalid input!");
			break;
		}
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
}